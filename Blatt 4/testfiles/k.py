class A:
    def method_1(self):
        a = 0
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
    if c > 3:
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
