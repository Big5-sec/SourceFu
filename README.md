<p align="center">
  <a href="https://imgbb.com/"><img src="https://image.ibb.co/hcUOxA/SourceFu.png" alt="SourceFu" border="0" /></a>

  <p align="center">
    An hopefully generic source-to-source deobfuscator
    <br>
    <a href="https://big5-security.com/sourcefu/"><strong>Explore SourceFu docs &raquo;</strong></a>
    <br>
  </p>
</p>

<br>

## Table of contents
- [Introduction](#introduction)
- [Quick start](#quick-start)
- [Documentation](#documentation)
- [Building SourceFu] (#building)
- [Wanna help](#wanna-help)
- [Community](#community)
- [Creators && Contributors](#creators-contributors)
- [Copyright and license](#copyright-and-license)

## Introduction

SourceFu is a java program aiming at providing in the end a source-to-source deobfuscation framework, based on partial evaluation and compilers middle-front. Especially, the whole process aims at being documented [there](https://big5-security.com/sourcefu/functioning.html) For now, the work have been focused on VBA code. 

**DISCLAIMER** :

- SourceFu is still in an experimental state. Results might be wrong.
- Partial evaluation is an hard subject. As such, not every VBA code for now will be correctly treated.
- More, the author actually realized a huge modification is to be done for SourceFu to handle more codes (like a full interpreter).
- This project is only developed on my spare time. **Any help from you** (even simply giving samples on which SourceFu does not work) will be really appreciated!

## Quick start

```
git clone https://github.com/Big5-sec/SourceFu.git
cd SourceFu
java -jar ./jar/SourceFu.jar standalone ./tests/VBA/obfuscators/JO-Obfuscator/code.vba
```

## Documentation

SourceFu's documentation, included in this repo in the root directory, is built with [Sphinx](http://www.sphinx-doc.org/en/master/) and publicly hosted on the author's personal [website](https://big5-security.com/sourcefu/). The docs may also be built locally.

## Building SourceFu

Thanks to [Gradle](https://gradle.org/), SourceFu is easy to build :

```
cd SourceFu/sourcefu/
./gradlew fatJar
```

## Wanna help?

There are plenty of ways to contribute to SourceFu :

- You are a user who encountered a bug: Please fill in an issue, with the "bug" tag.
A bug is encountered when SourceFu crashes, or when SourceFu analysis is wrong. An analysis is wrong when the transformations realized by the tool are not correct. However, when some code is not transformed or analyzed by the tool, it's not a bug. In this latter case, you should better submit a feature request.

- You are a user who has some feature request: Please fill in an issue with the "feature" tag.
First, make sure that your feature is not already added in the roadmap. If not, your feature will be reviewed. If your feature request is accepted, then it will be added to roadmap, and hopefully developed then :)

- You are a infosec developper wanting to integrate more features to SourceFu. Don't hesitate to make some pull requests! However, make sure your code is at least documented :)

- You are a java developper: you can certainly help me to have a better code (syntax, performance, usages, and so on...) Please don't hesitate.

- You are a language expert/ANTLR expert: SourceFu works by using ANTLR grammars. You could produce some BNF grammars to extend the supported languages or improve current ones.

- You are a web developper: You can improve the current graphical interface of SourceFu.

- You are a graphist: Let's be honest, the current logo is fucking ugly and made on paint. If you can produce a better one, i'm taking it!

- You are a scientist: Several open questions remain : Could we determine programatically if comments in a code are relevant or not? How could we rename variables given their usage in the code? How could we improve in general the deobfuscation?

## Community

posts, contacts and so on made about SourceFu will be available here.

## Creators && contributors

author : **Nicolas ZILIO**

- <https://twitter.com/Big5_sec>
- <https://github.com/Big5>


contributors :
  empty for now :( 

## Copyright and license

Code and documentation copyright (c) 2017- 2018 the [SourceFu Authors](#creators-contributors). Code released under the [Mozilla Public License 2.0](). Docs released under [Creative Commons]().
