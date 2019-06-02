<p align="center">
  <a href="https://big5-security.com/files/hosting/SourceFu.png"><img src="https://big5-sec.github.io/SourceFu/" alt="SourceFu" border="0" /></a>

  <p align="center">
    An hopefully generic source-to-source deobfuscator
    <br>
    <a href="https://big5-sec.github.io/SourceFu/"><strong>Explore SourceFu docs &raquo;</strong></a>
    <br>
  </p>
</p>

<br>

## Table of contents
- [Introduction](#introduction)
- [Quick start](#quick-start)
- [Documentation](#documentation)
- [Building SourceFu](#building-sourcefu)
- [Wanna help](#wanna-help)
- [Community](#community)
- [Creators && Contributors](#creators-contributors)
- [Copyright and license](#copyright-and-license)

## Introduction

SourceFu is a java program aiming at providing in the end a source-to-source deobfuscation framework, based on partial evaluation and compilers middle-front. Especially, the whole process aims at being documented [there](https://big5-sec.github.io/SourceFu/functioning.html).

<img src="https://big5-sec.github.io/SourceFu/_images/sourcefu_exemple.gif" alt="sourcefu_gif" border="0" />    

**DISCLAIMER** :

- SourceFu is still in an experimental state. Results might be wrong, tool might as well crash.
- Deobfuscation is an hard subject, the work is huge.
- This project is only developed on my spare time. **Any help from you** (even simply giving samples on which SourceFu does not work or telling me about syntax errors in this documentation) will be really appreciated!


## Quick start

```
wget https://github.com/Big5-sec/SourceFu/releases/download/Development/sourcefu-dev-0.01.jar
wget https://github.com/Big5-sec/SourceFu/raw/master/tests/VBA/obfuscators/JO-Obfuscator/code.vba
java -jar sourcefu-dev-0.01.jar standalone code.vba
```
    
## Documentation

SourceFu's documentation, included in this repo in the root directory, is built with [Sphinx](http://www.sphinx-doc.org/en/master/) and publicly hosted on github [pages](https://big5-sec.github.io/SourceFu/). The docs may also be built locally.    

## Building SourceFu

Thanks to [Gradle](https://gradle.org/), SourceFu is easy to build :

```
cd SourceFu/sourcefu/
./gradlew fatJar
```

The generated jar will be present in `SourceFu/sourcefu/build/libs/`    
    
## Wanna help?

There are plenty of ways to contribute to SourceFu :

- the simplest form is to simply show your interest in the project. :)        

- You are a user who encountered a bug: Please fill in an issue, with the "bug" tag.
A bug is encountered when SourceFu crashes, or when SourceFu analysis is wrong. An analysis is wrong when the transformations realized by the tool are not correct. However, if the analysis made by SourceFu is not complete for you, that's not a bug, but more a SourceFu limitation. In this latter case, you should better submit a feature request so that the tool can be improved ;)

- You are a user who has some feature request: Please fill in an issue with the "feature" tag.
First, make sure that your feature is not already added in the roadmap. If not, your feature will be reviewed. If your feature request is accepted, then it will be added to roadmap, and hopefully developed then :)
       
- You are a infosec developper wanting to integrate more features to SourceFu. Don't hesitate to make some pull requests! However, make sure your code is at least documented (even if the current one is not so well documented :P )

- You are a java developper: you can certainly help me to have a better code (syntax, performance, usages, and so on...) Please don't hesitate.

- You are a language expert/ANTLR expert: SourceFu works by using ANTLR grammars. You could produce some BNF grammars to extend the supported languages or improve current ones. There are huge improvements that could be done, like working only on AST: should we rewrite the TokenStreamWriter Interface?.

- You are a web developper: You can improve the current graphical interface of SourceFu.

- You are a graphist: Let's be honest, the current logo is fucking ugly and made on paint. If you can produce a better one, i'm taking it!

- You are a scientist: Several open questions remain : Could we determine programatically if comments in a code are relevant or not? How could we rename variables given their usage in the code? How could we improve in general the deobfuscation?

## Community

posts, contacts and so on made about SourceFu will be available here.

## Creators && contributors

author : **Nicolas ZILIO**

- <a href="https://twitter.com/Big5_sec">twitter</a>
- <a href="https://big5-security.com">personal website</a>


contributors :
  empty for now :( 

## Copyright and license

Code and documentation copyright (c) 2017- 2019 the [SourceFu Authors](#creators-contributors). Code released under the [Mozilla Public License 2.0](). Docs released under [Creative Commons]().
