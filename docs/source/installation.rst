Installation
************

.. warning:: SourceFu has only been used for now on Linux, and does not provide much configuration. As such, only the command line part of SourceFu is officially supported to work on Windows. For a full working solution on Windows, the following instructions should be adapted by the fellowed reader

CLI
====

SourceFu comes as a full packaged jar file. As such, all you have to do to get SourceFu CLI running is a java-runtime on your machine. To do so, use your favorite package manager and use the command :

.. code-block:: none

   $ sudo <your package manager> install openjdk-<version>-jre

You should now be able to launch SourceFu by doing in a terminal

.. code-block:: none

   $ java -jar sourcefu-<version>.jar --help


.. note:: to add SourceFu to your path, the best is to copy SourceFu in your /bin directory, then create a bash wrapper in this directory with the command above

          
API server & webserver
======================

To keep track of analyses and such across utilization, those two subcommands of SourceFu require a MongoDB database listening on the default port 27017 on localhost.

To have MongoDB running, please follow your distribution recommandations (it would be a bit out of scope right now). For Ubuntu, it's as simple as the following:

.. code-block:: none

   $ sudo apt install mongodb

You can then check MongoDB service status, and run the following to make sure your mongo is up :

.. code-block:: none

   $ mongo --eval 'db.runCommand({ connectionStatus: 1 })'


You can now launch SourceFu API server, and check for a line like such ::

   [qtp35369880-16] INFO org.mongodb.driver.connection - Opened connection [connectionId{localValue:2, serverValue:44}] to localhost:27017

webserver
=========

The current state of SourceFu's webserver requires the use of internet, in order for example to get Bootstrap CSS. This might change in the future...
