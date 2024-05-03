import pandas as pd 

df = pd.read_csv("./iris-reader/iris.data", names = ["Sepal Lenght", "Sepal Width", "Tepal Lenght", "Tepal Width", "Category"], header = None)

first_row = df.iloc[0:6]
print(first_row)
print(type(first_row))
