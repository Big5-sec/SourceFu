//the following are editor functions


//this function permits to gather the code within the editor of the web page
function gatherCode() {      
    var originalDiv = $('#workpane');
    var editor = originalDiv.next('.CodeMirror')[0].CodeMirror;
    return editor.getTextArea().innerText;
}

//function setting a new step for the analysis
// it gathers the value of the text area next to the "new step" link
// then realizes some fetch to update the internal status of the analysis
// finally, the list of steps for select is updated. 
function setNewStep() {
    var stepName = $('#new-step-name')
    if (stepName == ''){
        $('#my-message').innerHTML = "cannot set a new step with an empty name"
        $("#my-popup").modal();
        return;
    }
    var stepCode = gatherCode();
    var data = new FormData();
    data.append('code', stepCode);
    data.append('name',stepName);
    data.append('analysisId',analysisId);
    fetch('/api/analysis/createNewStep', {
      method: 'POST',
        body:data
    }).then(function(response) {
        return response.json();
    }).then(function(myJson) {
        if(myJson.status == 'OK') {
            $('#my-message').innerHTML = "cannot set a new step with an empty name"
        } else {
            $('#message-label').innerHTML = "OK"
            $('#my-message').innerHTML = "step added"
        }
        $("#my-popup").modal();
    })     
}

function loadAvailableSteps() {
    fetch('api/analysis/AnalysisSteps/'+analysisId).then(function(response) {
      return response.json();
    }).then(function(myJson) {
        if(myJson.status == 'OK') {
            out.innerHTML = "<pre style=\"background:grey;\">"+myJson.output+"</pre>";
        } else {
            out.innerHTML = "<pre>an error occured!</pre>";
        }
    })  
}    

function loadStep() {
    var stepList = $('#step-list');
    var stepToLoad = stepList[0].value;
    console.log(stepToLoad);
}




//the following are operations functions

function deletecomments() {
    var out = document.querySelector("#output123");
    out.innerHTML = "<pre> Loading... please wait </pre>";
    var currentcode = gatherCode();
    var data = new FormData();
    data.append('input', currentcode);
    fetch('/api/actions/deleteComments', {
        method: 'POST',
        body:data
    }).then(function(response) {
        return response.json();
    }).then(function(myJson) {
        if(myJson.status == 'OK') {
            out.innerHTML = "<pre style=\"background:grey;\">"+myJson.output+"</pre>";
        } else {
            out.innerHTML = "<pre>an error occured!</pre>";
        }
    })     
}

function newOperation() {
    var operation = $('#operation-select')[0].value;
    var code = gatherCode();
    var data = new FormData();
    data.append('operation', operation);
    data.append('code', code);
    data.append('setnewstep', false);
    fetch('/api/actions/newOperation', {
      method: 'POST',
      body: data
    })
}

function make_steps_diagram() {
    var GO = go.GraphObject.make;
    var myDiagram =
        GO(go.Diagram, "my-diagram-div"
           {
               "undoManager.isEnabled": true // enable Ctrl-Z to undo and Ctrl-Y to redo
           });
    var myModel = GO(go.Model);
    model.nodeDataArray = [
        { key: "Alpha" },
        { key: "Beta" },
        { key: "Gamma" }
    ];
    myDiagram.model = myModel;
}
