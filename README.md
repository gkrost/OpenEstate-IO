OpenEstate-IO 1.5
=================

[![CI](https://github.com/gkrost/OpenEstate-IO/actions/workflows/ci.yml/badge.svg)](https://github.com/gkrost/OpenEstate-IO/actions/workflows/ci.yml)
[![Maven Central](https://img.shields.io/maven-central/v/org.openestate.io/OpenEstate-IO-Core.svg)](https://search.maven.org/artifact/org.openestate.io/OpenEstate-IO-Core)
[![License](https://img.shields.io/github/license/gkrost/OpenEstate-IO.svg)](https://github.com/gkrost/OpenEstate-IO/blob/main/LICENSE.txt)

*OpenEstate-IO* provides a set of Java libraries to read and write real estate data in common formats. 


Supported Formats
-----------------

| Module                           | Format                                                                  | Type | Version    |
| -------------------------------- | ------------------------------------------------------------------------|:----:|:----------:|
| [`CasaIT`](CasaIT)               | [*Casa.it*](https://www.casa.it/) format **(experimental)**             | XML  | ?          |
| [`DaftIE`](DaftIE)               | [*Daft.ie*](https://www.daft.ie) Overseas Webfeed                       | XML  | 2.7        |
| [`Filemaker`](Filemaker)         | [*Filemaker*](http://www.filemaker.com) FMPXMLLAYOUT                    | XML  | ?          |
|                                  | [*Filemaker*](http://www.filemaker.com) FMPXMLRESULT                    | XML  | ?          |
| [`Idealista`](Idealista)         | [*idealista.com*](https://www.idealista.com/) format **(experimental)** | JSON | 6.00       |
| [`IDX`](IDX)                     | *IDX* format                                                            | CSV  | 3.01       |
| [`ImmoXML`](ImmoXML)             | *ImmoXML* format                                                        | XML  | 3.0        |
| [`ImmobarIT`](ImmobarIT)         | [*immobar.it*](https://www.immobar.it) format **(experimental)**        | XML  | 21/04/2015 |
| [`ImmobiliareIT`](ImmobiliareIT) | [*Immobiliare.it*](https://www.immobiliare.it) format                   | XML  | 2.8        |
| [`IS24-CSV`](IS24-CSV)           | *IS24-CSV* format (*legacy*)                                            | CSV  | 1.4.0.4    |
| [`IS24-XML`](IS24-XML)           | *IS24-XML* format (*legacy*)                                            | XML  | rev189438  |
| [`Kyero`](Kyero)                 | [*Kyero.com*](https://www.kyero.com) XML feed                           | XML  | 3.4        |
|                                  |                                                                         |      | 2.1        |
| [`OpenImmo`](OpenImmo)           | [*OpenImmo*](http://www.openimmo.de) format                             | XML  | 1.2.7b     |
|                                  |                                                                         |      | 1.2.7      |
|                                  |                                                                         |      | 1.2.6      |
|                                  |                                                                         |      | 1.2.5      |
|                                  |                                                                         |      | 1.2.4      |
|                                  |                                                                         |      | 1.2.3      |
|                                  |                                                                         |      | 1.2.2      |
|                                  |                                                                         |      | 1.2.1      |
|                                  |                                                                         |      | 1.2        |
|                                  |                                                                         |      | 1.1        |
| [`Trovit`](Trovit)               | [*Trovit.com*](https://www.trovit.com) Homes Feed                       | XML  | ?          |
| [`WisIT`](WisIT)                 | [*Wohnen-in-Suedtirol.it*](https://www.wohnen-in-suedtirol.it) format   | XML  | 2.2        |

Open a module subfolder to get more information about the specific format.

Changelog
---------

Take a look at [`CHANGELOG.md`](CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). 


Support
-------


Further information
-------------------
- forked from [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
