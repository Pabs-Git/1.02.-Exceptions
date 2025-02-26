📄 Description

This folder contains the exercise for the Level 1 of Exceptions.

💻 Technologies Used

Java 8+ (required for Lambdas and Streams API)
IntelliJ IDEA or any Java IDE for code development
Command-line terminal (for compiling and running the code)

📋 Requirements

Java 8 or higher.
An IDE such as IntelliJ IDEA or Eclipse for coding.
The ability to compile and run Java code through the terminal.

🛠️ Installation

Clone the repository or download the project folder to your local machine.
Open the project folder in your IDE (such as IntelliJ IDEA).
Ensure that Java 8 or later is set as the SDK in your IDE.


📋 EXERCISE 1

Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".