Some state of the art
*********************

Automatic deobfuscation of source code is not an easy subject. Basically, almost all tools that exist do either the following:

- a runtime deobfuscation. The idea is basically to run the sample in a sandboxed environment, and use instrumentation to extract interesting information. A simple example is to execute some javascript in a sandboxed environment and replace calls to *eval* function with *alert* or *console.log*. A more advanced example seems to be the AMSI interface of Windows, that seems to provide somehow every call to function with their arguments. An another example (and a great project) is the Vipermonkey project from @decalage2. The idea is to extract every potential interesting calls to functions known to be used in malicious documents and to see their arguments.
- a static deobfuscation based on beautifying and regexes replacement. A good example is the powershell deobfuscator made by endgame (unfortunately not open sourced).

In the first case, the source code cannot be interacted directly with (what about running yara huh?). It means also that you almost needs an analysis environment capable of interacting with the analyzed language. As such, those tools are often coded in the same language than the one inspected. Also, potentially, a tool can auto-pown itself as code stay executed.

In the second case, it appears that most of the time those tools do not provide good enough results.

In order to overcome those caveats, some people proposed to use what is called partial evaluation. The idea for that is to interpret only tiny pieces of a whole AST of the languages, and then modify it to have a more compact AST. It should also provide static transformations not based on the interpretation to simplify the code. Indeed, it avoids a complete interpretation, prone to errors, and avoids potential faults in regexes. This process can also be multi-pass, in order to overcome a multi-layer approach. 

A deobfuscator based on partial evaluation will do things like :

- dead code elimination
- basic constant folding
- expressions simplification

Some tools aim at providing such an analysis. Those are JSDetox and JStillery, for javascript only.

Unfortunately, no other languages have tools that do so. SourceFu aims so at providing a generic tool to answer this caveat, while providing a better deobfuscation framework.


