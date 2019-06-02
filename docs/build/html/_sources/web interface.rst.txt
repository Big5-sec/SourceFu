Web interface
*************

This page presents how to use the web interface of SourceFu.

On accessing the home page, you're presented with the following :

.. image:: imgs/webserver-1.png
   :scale: 40%
   :align: center

Here, it's basically a simple list of all your analyses, with buttons to interact with them. The first button (the gearing) is here to access the parameters of the analysis. However, be aware that the underlying page is not finished nor functional at this time. The second button permits to delete the analysis from the database. Finally, the final button permits to enter into the analysis. Please note that the title in the dark bar permits to go back to this page.

By clicking the blue button on the right upper side, you can create a new analysis. You're given for this the following form :

.. image:: imgs/webserver-2.png
   :scale: 40%
   :align: center


On the following form, there two points to note :
- the radio button is not working for now. There won't be analysis launched directly.
- When you're selecting the language of the sample, SourceFu might try to detect it by itself. Be aware that this option may not work due to the way SourceFu makes his analysis. As such, if you're getting an error by selecting "Try to auto-determine", you may try to force the language by setting it expressively.


When you go into an analysis, you're presented the following :

.. image:: imgs/webserver-3.png
   :scale: 40%
   :align: center


This first page is here simply to present some information on the analysis. *Original* stands for the original code, *deobfuscated* is not implemented for now, so don't care, and *current step* represents the code of the current step of the analysis.

On tabs, the only one interesting for now is work view:

.. image:: imgs/webserver-4.png
   :scale: 40%
   :align: center

In this view, you're presented with an editor at the top, where you can manaually edit files. The *operations* part below permits to launch deobfuscation operations from SourceFu. Simply select the operation you want to be run on the code from the editor, and you're set. Finally, buttons regarding steps permit to set a new step of the analysis, or to load a previous defined step.
