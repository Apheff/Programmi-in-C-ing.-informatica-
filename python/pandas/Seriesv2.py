import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


data = {
    "Jobs" : pd.Series(["Engigneer", "Doctor"], index = ["first", "second"]),
    "Cities": pd.Series(["Rome", "Paris", "New York"], index = ["second", "third", "fourth"])
}

df = pd.DataFrame(data)
print(df)
print(df.index)
print(df.columns)
print(df.shape)



data = {
    "column1": [2, 4, 5, 6, 7],
    "column2": [3, 3, 10, 3]
}

df = pd.DataFrame(data)
print(df)   #dara' un errore perche il dataframe non sa come associare gli elementi delle due colonne (serve una Series) 