Planned Features
****************

.. |br| raw:: html

   <br/><br/>

- find a better deobfuscation routine : specify completely rules producing a "better visibility" on the code. Basically, one could argue the following rule works : if a replacement to be done is more concise than then expression to be replaced, then it should be done. Also, a variable should be replaced only if it permits expression replacement afterwards. |br|


- provide a better cli for sourcefu, with the following options (with something similar to Cuckoo):

   - standalone : a terminal use of the tool

   - server : lauching a server that is able to realize operations through an API

   - client : launching a server offering a complete graphical interface to SourceFu (ideally, something with syntax coloring, renaming support like in IDA pro, and meld like interface) |br|


- provide analysis such as ViperMonkey, callgraph, and such |br|


- use of database to keep results |br|


- plugin support, huh??? (yara, VT,...) |br|


- support more language |br|


- support multiple languages in the same code, like for example when a VBA macro calls an obfuscated Powershell... |br|


