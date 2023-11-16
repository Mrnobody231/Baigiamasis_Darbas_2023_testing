### Automation tests for www.patogupirkti.lt
<br>
 1. Log in to your account (Positive test)

    * Open  Website www.patogupirkti.lt
    * Decline "Cookies"
    * Click  "Prisijungti"
    * In the field"Email" write : andruskevic.e@gmail.com
    * In the field "Password" write : Testing2023QA
    * Click on button "Prisijungti"

      Expected Result: Should be seen message "Mano paskyra"
<br>



2. Log in to your account (Negative test)

       * Open  Website www.patogupirkti.lt
       * Decline "Cookies"
       * Click  "Prisijungti"
       * In the field"Email" write : andruskevic.e@gmail.com
       * In the field "Password" write : Testing2023
       * Click on button "Prisijungti"

         Expected Result: Should be given message "Neteisingas prisijungimo vardas arba slaptažodis."
<br>

3. Count books using filters

       * Open  Website www.patogupirkti.lt
       * Click "Ispardavimas" button
       * Section "Knygu Ispardavimas" select "Grozine Literatura"
       * Section "Rekomenduojame" select "Turime sandelyje"
       * Section "Leidyklos" in search box write "Alma littera"
       * Select "Alma littera"

         Expected Result: Should be showing "Rasta: 14"
<br>

4.  Add book to the shopping bag

        * Open  Website www.patogupirkti.lt
        * Write in search box : "George Orwell"
        * Click on button "Search"
        * Choose book "Gyvuliu ukis"
        * Click "I krepseli"

           Expected Result: Should be given a message "Prekė įdėta į krepšelį"
<br>

5. Delete a book from shopping bag

       * Open  Website www.patogupirkti.lt
       * Write in search box : "George Orwell"
       * Click on button "Search"
       * Choose book "Gyvuliu ukis"
       * Click "I krepseli"
       * Click on message "Pirkti"
       * Click on icon "X"-Pasalinti is krepselio

           Expected Result: Should be given a message "Prekių krepšelis yra tuščias"
<br>

6. Add book to WishList

       * Open  Website www.patogupirkti.lt
       * Click  "Prisijungti"
       * In the field "Email" write : andruskevic.e@gmail.com
       * In the field "Password" write : Testing2023QA
       * Click on button "Prisijungti"
       * Write in search box : "George Orwell"
       * Click on button "Search"
       * Click on book "Gyvuliu ukis"
       * Click on "I noru sarasa"
       * On showing message click "Noru sarasa"
       * Click button "Pasalinti"
       * Click on alert "OK"

           Expected Result: Adding book in wishlist can read "Gyvulių ūkis""



