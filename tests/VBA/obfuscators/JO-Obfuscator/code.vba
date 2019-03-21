    'This is an example for SourceFu. This code is simply the JO-Obfuscator sample
    'Here is the original code of the demo (slightly modified)

''-- Ceci est une macro de démonstration de JO-OBfuscator : www.joseouin.fr
''-- Déclaration des variables
'Dim Message1 As String
'Dim Message2 As String
'Dim Titre As String
'Dim MesON As Integer
'Dim Kp As Integer
'Dim Rep As Integer
''-- Fin de déclaration des variables
'
'Message1 = "JO-OBfuscator" & vbCrLf & vbCrLf
'Message2 = "Ceci est une démonstration de JO-OBfuscator." & vbCrLf & vbCrLf
''-- Remarque : vbCrLf est une constante VBA (Cr : Carriage return et Lf : Line feed)
'Kp = Len(Message1)
'
'If Kp = 17 Then
''-- On met la variable MesON à 1
'MesON = 1
'Else
''-- On met la variable MesON à 0
'MesON = 0
'End If
'
''-- Contenu du message :
'Titre = "JO-OBfuscator : Vidéo de démonstration"
'Message = Message1
'Message = Message & Message2
'Message = Message & "Téléchargez la version originale sur www.joseouin.fr" & vbCrLf & vbCrLf
'Message = Message & "Auteur : José OUIN - Site Internet : www.joseouin.fr"
'
''-- Affichage de la boîte si le classeur Excel n'est pas en lecture seule et si MesON = 1
'If MesON = 1 Then
'Rep = MsgBox(Message, vbInformation + vbOKOnly, Titre)
'End If
''------
'
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

 

