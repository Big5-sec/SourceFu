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
End Sub