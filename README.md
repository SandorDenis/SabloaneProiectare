# Feedback lab4:
I am not sure I implemented the Proxy design pattern correctly, could you please take a look?



# Feedback lab2 and lab3:
https://github.com/SandorDenis/SabloaneProiectare/tree/4730e556bd8ed3baa14115716de41d8833340f26

- write print() method to be specific in each type of class (do not use toString())
example:
https://github.com/SandorDenis/SabloaneProiectare/blob/master/src/main/java/Image.java#L16 to be:
    System.out.println("Image: " + url);
    
- no need to check what kind of instance are elements. Simply have like:
https://github.com/SandorDenis/SabloaneProiectare/blob/master/src/main/java/Section.java#L21
for(Element element: elements) {
  element.print()
}

# Feedback lab4:

all good

# Feedback lab5+6:
https://github.com/SandorDenis/SabloaneProiectare/tree/a74711990b575b192d195e62f34771ace25d6644

visitor pattern not implemented, only prototypes

# Proposed grade: 9
