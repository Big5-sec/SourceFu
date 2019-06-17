Command line interface
**********************

The command line interface of SourceFu is basically a way to realize one deobfuscation operation on a file, to finally get an output. You can invoke multiple operations at the same time but you don't control the order they are invoked, because they follow the general algorithm presented [there](). If you want to chain deobfuscation operations, you need for now to output each operation in a file, and use this temporary file as an input for a subsequent operation.

The command line is basically the following:

.. code-block:: none

   $ java -jar sourcefu.jar <deobfuscation operations to run> <input_file> [<output_file>]

the output file is not mandatory. The result of the operation is indeed somewhat printed to the stdout. However, if you need to save the output of the tool, please use this option.
   
In the arguments relative to deobfuscation operations, each switch permits to invoke the underlying deobfuscation operation. If no deobfuscation operation switch is passed, then SourceFu makes a full analysis invoking all operations. If at least one swith is selected, then only the selected switches will be invoked.

Here is the full list of switches:

- -B, --beautify          perform a beautify operation
- -C, --comments          perform a comments deletion operation
- -D, --deadstore         perform a deadstore operation
- -E, --empty             perform a "empty block deletion" operation
- -K, --constantsmodify   perform the transformation of internal language variables
- -R, --rename            perform a rename operation
- -V, --partialeval       perform the transformation of internal language variables

When using the contracted arguments, you can pass them as a single argument. Passing ``--BCE`` will for example remove the comments, then remove empty *blocks* in the code, and finally,  a beautifying operation is launched.

The final option is the ``-t, --source-type=<input_type>`` argument. It's a way to indicate what is the language of the analyzed sample. Indeed, no tool is capable of detecting easily if a sample is from one language or another. SourceFu does so by trying a parsing operation in strict mode, allowing to detect errors. However, parsing is not so simple, and for example, parsing may be the result of errors fallback... If the language of your sample is not detected automatically, then you should use this option to force it. The available possibilites for the input type are *JS* and *VBA*.

