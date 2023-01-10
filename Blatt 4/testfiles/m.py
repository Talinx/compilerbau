class A:
    a = 4
    def method_1(self):
        print(self.a)
    #end
    
    def addToA(self, b):
        self.a = self.a + b    
    #end
#end

a = A()
a.addToA(5)
a.method_1()