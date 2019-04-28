Roadmap
*******

Roadmap
-------

====================================================================== ======
   SSTIC 2019
-----------------------------------------------------------------------------
  Steps                                                                Status
====================================================================== ======  
Javascript : implements expression simplification
Javascript : gather samples
Powershell : create functional grammar, maybe
VBA: add tables support
VBA: add constant return functions simplification
API server : makes it almost functional
Web server : makes it almost functional too :)
core : add tests, to serve as a basis and an improve point
documentation : complete it
documentation : make some stats about deobfuscation for prez
core : code formating and commenting
====================================================================== ======  



Ideas
-----

core
~~~~
- always improve code support and deobfusactions routines!!!
- full interpretation : go further for loops and functions interpretation for example
- make analysis like vipermonkey, jsdetox, 
- functions inlining  
- spaghetti code simplification by basic block tagging
- add support for basic (autoit), and others?
- might be interesting to go further for another langages like python (beh bytecode editing?)
- might propose it to cuckoo when the tool will be quite correct?
- variables renaming based on context
- how to make the diff between optimization and vizualization of code?
- automatically determine if comments are helpful or not?
- automatically recovers elements caracterizing anti-debug and such
- support multiple languages in the same code, like for example when a VBA macro calls an obfuscated Powershell...
- support directly files instead of code (like office ones)
  

API server
~~~~~~~~~~
- makes it more unified


web interface
~~~~~~~~~~~~~
- maybe separate it from api server
- full featured IDE like
- add more properties to the IDE, like direct interaction with picked token (renaming, invoking special routines, etc...)
- add plugins like VT, yara and such  


tests
~~~~~

- gather multiple samples on the web


documentation
~~~~~~~~~~~~~






