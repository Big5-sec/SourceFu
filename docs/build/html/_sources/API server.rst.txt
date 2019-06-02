API server
**********

Here is the documentation for the current API of SourceFu:

- creating a new analysis in SourceFu

.. code-block:: none  

   POST /api/analysis/newAnalysis
   Content-Type : multipart/form-data

    the following parameters are requested :

    - *analysisname* : the name of the analysis to create
    - *analysislanguage* : the language of the sample to analyze, current values that are legual are Javascript, VBA and *Try to auto-determine*
    - *analysisfile* : the current file to analyze


- creating a new step for one analysis

  .. code-block:: none  

   POST /api/analysis/createNewStep
   Content-Type : multipart/form-data

    the following parameters are requested :

    - *name* : the name of the step to create
    - *code* : the step code to set (basically, some code with modifications
    - *analysisID* : the analysis ID, used to select to which analysis this step will belong to


- get a step from an analysis

.. code-block:: none

   GET /api/AnalysisStep/:analysisId/:stepId

   analysisId is the ID of the analysis to gather step from, and step Id is the step to gather by Id

- delete an analysis

.. code-block:: none

   GET /api/delAnalysis/:analysisId

   analysisId is the ID of the analysis to delete

   
- launch a new operation on a code :

  .. code-block:: none  

   POST /api/analysis/createNewStepactions/newOperation
   Content-Type : multipart/form-data

    the following parameters are requested :

    - *code* : the code to do an operation on it
    - *setnewstep* : should we automatically define the result of the operation as a new analysis step?
    - *analysisID* : the analysis ID, used to select to which analysis this new operation will belong to
    - *operation* : the operation to do on the code. Possible values for VBA are : *delete comments*, *rename variables (based on scope)*, *dead code elimination*, *beautify*, *expressions evaluation*, *cfg simplifications*, *full analysis*, *empty block removal*. For Javascript, operations may be *delete comments*, *rename variables (based on scope)*. To know what each operation does, please refer to the following :doc:`page</functioning>`
  


