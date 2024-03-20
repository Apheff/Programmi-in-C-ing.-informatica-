var1 = 5    #defined in the global namespace
print(var1)
def some_func():
    print("var1", var1)
    var2 = 6    #defined in the some_func() namespace

    def some_inner_func():
        print("var1", var1)
        print("var2", var2)
        
        var3 = 7    #defined in the some_inner_func() namespace
    
    print("var3", var3)

print("var1", var1) #only var1 will be printed
print("var2", var2)
print("var3", var3)