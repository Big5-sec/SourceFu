User manual
***********

.. |br| raw:: html

   <br />

SourceFu provides 3 different ways of working :

 - The first one is the command line interface. Basically, it's a way to invoke direclty SourceFu's routines. Here, no database is used and you have to use files redirection to make sure you keep a trace of modifications made. It's invoked by calling :

.. code-block:: none
                
    $ java -jar sourcefu.jar standalone

A full list of options are presented in the :doc:`underlying manual</command line interface>`

|br|
- The second one is the API server, using a database allowing us to keep a track of modifications done on samples. By using the provided :doc:`API</API server>`, you can code your own tools to interact with SourceFu. It's invoked by :
  
.. code-block:: none
                
    $ java -jar sourcefu.jar apiserver

|br|
- Finally, the :doc:`web interface</web interface>` is a way to interact with SourceFu with a user interface, making it more friendly to use. Before using this option, you should make sure to have followed installation instructions. To start the web server, simply enter :
  
.. code-block:: none
                
   $ java -jar sourcefu.jar webserver

Then, navigates to the following address: ``http://localhost:4567/``   

|br|
Here are the links to the associated user manuals :

.. toctree::
   command line interface
   API server
   web interface

   
