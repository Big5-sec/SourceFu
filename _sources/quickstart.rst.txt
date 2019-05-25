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

.. code-block:: vbnet

   Sub AutoOpen()
   Dim JOOBetjKa7lPQURVDETaHdF16 As String
   Dim JOOBetjKa7lPQURVDFTaHdF16 As String
   Dim JOOBetjKa7sTRTVTaHdF16 As String
   Dim JOOBetjKa7lPQesTaHdF16 As Integer
   Dim JOOBetjKa7j1TaHdF16 As Integer
   Dim JOOBetjKa7qPNTaHdF16 As Integer
   JOOBetjKa7lPQURVDETaHdF16 = Chr(74) & Chr(79) & Chr(45) & Chr(79) & Chr(66) & Chr(102) & Chr(117) & Chr(115) & Chr(99) & Chr(97) & Chr(116) & Chr(111) & Chr(114) & vbCrLf & vbCrLf
   JOOBetjKa7lPQURVDFTaHdF16 = Chr(67) & Chr(101) & Chr(99) & Chr(105) & Chr(32) & Chr(101) & Chr(115) & Chr(116) & Chr(32) & Chr(117) & Chr(110) & Chr(101) & Chr(32) & Chr(100) & Chr(233) & Chr(109) & Chr(111) & Chr(110) & Chr(115) & Chr(116) & Chr(114) & Chr(97) & Chr(116) & Chr(105) & Chr(111) & Chr(110) & Chr(32) & Chr(100) & Chr(101) & Chr(32) & Chr(74) & Chr(79) & Chr(45) & Chr(79) & Chr(66) & Chr(102) & Chr(117) & Chr(115) & Chr(99) & Chr(97) & Chr(116) & Chr(111) & Chr(114) & Chr(46) & vbCrLf & vbCrLf
   JOOBetjKa7j1TaHdF16 = Len(JOOBetjKa7lPQURVDETaHdF16)
   If JOOBetjKa7j1TaHdF16 = 17 Then
   JOOBetjKa7lPQesTaHdF16 = 1
   Else
   JOOBetjKa7lPQesTaHdF16 = 0
   End If
   JOOBetjKa7sTRTVTaHdF16 = Chr(74) & Chr(79) & Chr(45) & Chr(79) & Chr(66) & Chr(102) & Chr(117) & Chr(115) & Chr(99) & Chr(97) & Chr(116) & Chr(111) & Chr(114) & Chr(32) & Chr(58) & Chr(32) & Chr(86) & Chr(105) & Chr(100) & Chr(233) & Chr(111) & Chr(32) & Chr(100) & Chr(101) & Chr(32) & Chr(100) & Chr(233) & Chr(109) & Chr(111) & Chr(110) & Chr(115) & Chr(116) & Chr(114) & Chr(97) & Chr(116) & Chr(105) & Chr(111) & Chr(110)
   Message = JOOBetjKa7lPQURVDETaHdF16
   Message = Message & JOOBetjKa7lPQURVDFTaHdF16
   Message = Message & Chr(84) & Chr(233) & Chr(108) & Chr(233) & Chr(99) & Chr(104) & Chr(97) & Chr(114) & Chr(103) & Chr(101) & Chr(122) & Chr(32) & Chr(108) & Chr(97) & Chr(32) & Chr(118) & Chr(101) & Chr(114) & Chr(115) & Chr(105) & Chr(111) & Chr(110) & Chr(32) & Chr(111) & Chr(114) & Chr(105) & Chr(103) & Chr(105) & Chr(110) & Chr(97) & Chr(108) & Chr(101) & Chr(32) & Chr(115) & Chr(117) & Chr(114) & Chr(32) & Chr(119) & Chr(119) & Chr(119) & Chr(46) & Chr(106) & Chr(111) & Chr(115) & Chr(101) & Chr(111) & Chr(117) & Chr(105) & Chr(110) & Chr(46) & Chr(102) & Chr(114) & vbCrLf & vbCrLf
   Message = Message & Chr(65) & Chr(117) & Chr(116) & Chr(101) & Chr(117) & Chr(114) & Chr(32) & Chr(58) & Chr(32) & Chr(74) & Chr(111) & Chr(115) & Chr(233) & Chr(32) & Chr(79) & Chr(85) & Chr(73) & Chr(78) & Chr(32) & Chr(45) & Chr(32) & Chr(83) & Chr(105) & Chr(116) & Chr(101) & Chr(32) & Chr(73) & Chr(110) & Chr(116) & Chr(101) & Chr(114) & Chr(110) & Chr(101) & Chr(116) & Chr(32) & Chr(58) & Chr(32) & Chr(119) & Chr(119) & Chr(119) & Chr(46) & Chr(106) & Chr(111) & Chr(115) & Chr(101) & Chr(111) & Chr(117) & Chr(105) & Chr(110) & Chr(46) & Chr(102) & Chr(114)
   If JOOBetjKa7lPQesTaHdF16 = 1 Then
   JOOBetjKa7qPNTaHdF16 = MsgBox(Message, vbInformation + vbOKOnly, JOOBetjKa7sTRTVTaHdF16)
   End If
   End Sub
   

to the following code:

.. code-block:: vbnet

   Sub AutoOpen()
     Dim local_0 As Integer
     local_0 = MsgBox("JO-OBfuscator\r\n\r\nCeci est une démonstration de JO-OBfuscator.\r\n\r\nTéléchargez la version originale sur www.joseouin.fr\r\n\r\nAuteur : José OUIN - Site Internet : www.joseouin.fr", 64, "JO-OBfuscator : Vidéo de démonstration")
   End Sub                 
