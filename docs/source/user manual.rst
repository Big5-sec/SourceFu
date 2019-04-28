User manual
***********

.. |br| raw:: html

   <br />

SourceFu provides 3 different ways of working :

 - The first one is the command line interface. Basically, it's a way to invoke direclty SourceFu's routines. It's invoked by calling :

.. code-block:: terminal
                
    $ java -jar sourcefu.jar standalone

A full list of options are presented in the underlying manual

|br|
- The second one is the API server. It's a way to interact with a remote SourceFu server using a REST API. It's invoked by :
  
.. code-block:: terminal
                
    $ java -jar sourcefu.jar apiserver

The full public API is available in the associated manual.

|br|
- Finally, the web interface is a way to interact with SourceFu through a web interface, making it more friendly to use. Before using this option, you should make sure to have followed installation instructions. To start the web server, simply enter :
  
.. code-block:: terminal
                
   $ java -jar sourcefu.jar webserver

a more detailed description of the interface is done in the associated user manual file.

|br|
Here are the links to the associated user manuals :

.. toctree::
   command line interface
   API server
   Web Interface

   
