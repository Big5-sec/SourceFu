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
