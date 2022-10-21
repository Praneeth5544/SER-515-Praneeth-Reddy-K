# SER-515-Praneeth-Reddy-K
Design Patterns implemented are 
1)Facade
2)Bridge
3)Iterator
4)Factory

Prereq:
Input relevant text data files from users like login cred, MenuList options and user choices.
Stepl: Login Authentication
 a) Get details from user whether he/she is buyer or seller
 Buyer select 1
 Seller select 2
 user gives input based on functionlity
 b) Get Username of buyer/seller
 c) checks whether seller/buyer username included or not 
 d) If username exists then inputs password
 e)checks whether the password matches or not
 f) we use facade pattern to implement authentication

Step 2: Printing MenuList Types
 
 a)Upon succesfull authentication, app asks user for type of Menu
    1 for MeatProductMenu
    2 for ProduceProductMenu
 b) Based on user input the Menu list will be displayed
    1 for Beef            1 for Tomato			  
    2 for Pork		  2 for Onion
    3 for Mutton
 c) if user gives other input displays Invalid input
 d) we use Bridge pattern to implement this functionality

Step 3: Print Person Menu Details
 
 a) The items selected by person gets added to PersonMenu
 b) Display the items after getting added
 c) we use Iterator Design Pattern to implement this functionality

Step 4:Ask for More Items to select
 a) Invoke step2 once again
 b) Factory Pattern is implemented here. 


