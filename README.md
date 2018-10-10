****What is InfoApplication****

The application works in the command line.

The idea of the Info Application that I created is that it would display information which are "Clients" that is inside the application.
The user would also be able to add a new "Client" to the list that is already there.
There was also an idea to be able to modify the "Clients" that are already in the list. However this has not been completed.

The application includes some preset data in the system which follows the pattern of First Name, Address, Age. 
These are:
+ "Dustin Roads", "22 Bobble Street, Bobbleton, BB0 5TT", 22
+ "Roderick Piper", "37 Loop Street, Loopton, LP7 4PT",33
+ "Randall Savage", "29 Elizabeth Street, Elizabethtown, EL3 8ZZ", 50
+ "Jacob Roberts", "11 Cobra Road, Finsberg, FN4, 4FN",11

I have also implemented a basic login system using a key value pairs.
I created 4 username and password pairs which can be used to login to the system.
These are:
+ Jimmy  Jimb0257
+ Carl   Carlo56
+ Sharon Shazza88
+ Toby   T0bler0ne
    
The application will only continue when the username and password that the user inputs are correct.

****How to use it?****

The application starts by asking the user to input a Username & then a Password.
As long as the inputs are valid the application will move to a menu with three options.
The three options are Search Clients, Edit Existing Client Records, Add New Client Record.

When using Search Clients the user will be asked to input the full name of the client.
If the input matches the name of a "Client" in the data list it will display the client record.
The user will be asked if they have finished searching records, they are expected to answer with either a "Y" or "N".
If "N" they will be able to search again. If "Y" they will be sent back to the menu.

If the user chooses to Add New Client they will be asked to enter some new data.
They will first be asked to enter the Full Name of the new "Client", then the Full Address of the new "Client" and finally the age of the "Client".

    