C14385416 - Daniel Keogh
DocoSim Assignment
Brief explaination

This project consists of three primary classes:
-Control (Acts as the main function, and initiates methods)
-FileTransfer (Transfers the contents of three files into the Hashsets)
-SetComparing (Compares the contents of the Hashsets and give a percentile result)

Three text files are also used:
-stop_words.txt (Contains a list of stopwords that are taken out of comparison calculations)
-doc1.txt (Contains text to be compared)
-doc2.txt (Contains text to be compared)

The program starts by using FileTransfer.java to transfer the contents of the .txt files into created hashsets. It uses a scanner to read the file word by word, converting them to lower case and checking if they are contained in the stop_words.txt file. If so, they are not transferred otherwise they are put into a corresponding hashset. At the end of the class, the contents of each hashset for doc1.txt and doc2.txt, minus the stop words, and all of the stopwords then printed to screen. 

The program will then work on calculating the amount of similarity between the contents of the two hashsets in SetComparing.java. They are imported from FileTransfer.java and put into their own local hashsets. The SetCompare method is used to compare the contents of them. This consists of an if statement where doc1 and doc2 are compared to check if they are 100% similar, otherwise it is checked if one is larger than the other, and a percentage is calculated using a formula. The result is printed to screen.