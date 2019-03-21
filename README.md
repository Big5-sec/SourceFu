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
- [Status](#status)
- [Bugs and feature requests](#bugs-and-feature-requests)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [Community](#community)
- [Creators && Contributors](#creators-contributors)
- [Copyright and license](#copyright-and-license)

## Introduction

SourceFu is a java program aiming at providing in the end a source-to-source deobfuscation framework, based on partial evaluation and compilers middle-front. Especially, the whole process aims at being documented [there](https://big5-security.com/sourcefu/functioning.html) For now, the work have been focused on VBA code. 

**DISCLAIMER** :

- SourceFu is still in an experimental state. Results might be wrong.
- Partial evaluation is an hard subject. As such, not every VBA code for now will be correctly treated.
- More, the author actually realized a huge modification is to be done for SourceFu to handle more codes (like a full interpreter).
- This project is only developed on my spare time. Any help from you (even simply giving samples on which SourceFu does not work) will be really appreciated!

## Quick start

```
git clone https://github.com/Big5-sec/SourceFu.git
cd SourceFu
java -jar ./jar/SourceFu.jar standalone ./tests/VBA/obfuscators/JO-Obfuscator/code.vba
```

## Status

SourceFu only supports VBA code for now, and its transformations are still not fully complete. Please be indulgent, more languages should come in future.

- current development release (under jar repository): sourcefu-v0.0001.jar
- latest official release: none yet


## Bugs and feature requests
*still to do*

Have a bug or a feature request? Please first read the [issue guidelines]() and search for existing and closed issues. If your problem or idea is not addressed yet, [please open a new issue]().


## Documentation

SourceFu's documentation, included in this repo in the root directory, is built with [Sphinx](http://www.sphinx-doc.org/en/master/) and publicly hosted on the author's personal [website](https://big5-security.com/sourcefu/). The docs may also be built locally.

## Contributing

*still to do*

Please read through the [contributing guidelines](). Included are directions for opening issues, coding standards, and notes on development.

## Community

*still to do*

## Creators && contributors

author : **Nicolas ZILIO**

- <https://twitter.com/Big5_sec>
- <https://github.com/Big5>


contributors :
  empty for now :( 

## Copyright and license

Code and documentation copyright (c) 2017- 2018 the [SourceFu Authors](#creators-contributors). Code released under the [Mozilla Public License 2.0](). Docs released under [Creative Commons]().
