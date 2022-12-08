class A:
    def method_1(self):
        ...
    #end
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
