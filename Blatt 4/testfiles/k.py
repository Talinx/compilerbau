class A:
    def method_1(self):
        ...
    #end
#end

class B(A):
    def setA(self, a):
        self.a = a
    #end

    def getA(self):
        return self.a
    #end
#end

def b(c):
    print("Hi from b")
    1
    2
    if c > 3:
        1
        ...
        2
        print("Hello")
    else:
        pass
        print("c is to large")
    #end
    3
    return "hi"
#end

a = b()
print(a)