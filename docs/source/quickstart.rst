Quickstart
**********

We are going to use SourceFu to deobfuscate the VBA obfuscated demo sample of JO-Obfuscator found `at this address <http://www.joseouin.fr/logiciels/logiciel-jo-obfuscator>`_. This sample has been copied into the document that can be found under the `tests/VBA/obfuscators/JO-obfuscator` repository of SourceFu project. The following procedure should be realized on Linux. Let's first download the materials to test SourceFu.

.. code-block:: terminal

   /home $ cd /tmp
   /tmp $ git clone https://github.com/Big5-sec/SourceFu.git && cd SourceFu

We need a way to extract VBA code from this document (in future, SourceFu should be able to do it automatically). To do so, one can use oletools made by Didier Stevens.

.. code-block:: terminal

   /tmp/SourceFu $ sudo pip install -U oletools
   /tmp/SourceFu $ olevba -c ./tests/VBA/obfuscators/JO-Obfuscator/sourcefu_example.docm > test.vba

Header of the output file must be then removed in order for SourceFu to parse pure VBA code.

.. code-block:: terminal

   /tmp/SourceFu $ tail -n +17 ./tests/VBA/obfuscators/JO-Obfuscator/test.vba > ./tests/VBA/obfuscators/JO-Obfuscator/code.vba

Finally, SourceFu can be run against the VBA code. If no options are provided, then all deobfuscation routines are launched against the sample :

.. code-block:: terminal

   /tmp/testfu $ java -jar ./jar/sourcefu.jar standalone ./tests/VBA/obfuscators/JO-Obfuscator/code.vba

From the output, the VBA code was transformed from this:

.. code-block:: terminal









to the following code:


.. code-block:: terminal
