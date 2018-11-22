* Task1 (_javac -d bin src/Hello.java_)
* Task2 (_javac -d bin src/*.java_ && _cd bin_ && _java Test_)
* Task4:
    * (_cd lib_) && (_javac -d bin src/com/gmail/vlkr/hello/HelloWriter.java_)
    * (_jar cf hello.jar bin/com/gmail/vlkr/hello/*.class_)
* Task5:
    * One (_javac -d . src/One.java_) && (_java -cp . classes.my.pack1.One_)
    * Two (_javac -cp . -d . src/Two.java_) && (_java -cp . classes.my.pack2.Two_)