JFLAG = -g
COMPILE = javac
SRCDIR = src/clubSimulation
BINDIR = bin
DOCDIR = doc

.SUFFIXES: .java .class
.java.class:
	$(COMPILE) $(JFLAG) -cp $(BINDIR) $*.java -d $(BINDIR)

CLASSES = $(SRCDIR)/*.java

default: classes

classes:
	$(COMPILE) $(JFLAG) -cp $(BINDIR) $(CLASSES) -d $(BINDIR)

clean:
	$(RM) $(BINDIR)/clubSimulation/*.class

javadoc:
	javadoc -d $(DOCDIR) $(SRCDIR)/*.javaJFLAG = -g

