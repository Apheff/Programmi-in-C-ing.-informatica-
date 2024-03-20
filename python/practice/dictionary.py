dict_a = {
    1: "ciao",
    (2, 4): "prova"
}
print(dict)
#print(dict_a["ciao"]) errore perche' si puo' accedere solo per keys
#print(dict_a[2]) errore perche' non esiste la chiave

dict_a[2] = "ciao2"
print(dict_a)

#funzioni per dizionari
dict_b = {
    1: "Ciao",
    2: "Python",
    3: 45.0
}

print(dict_b.keys())
print(dict_b.values())
print(dict_b.items())