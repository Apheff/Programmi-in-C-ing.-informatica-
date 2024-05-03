import pandas as pd
import matplotlib
import matplotlib.pyplot as plt
import seaborn as sea

pd.set_option('display.expand_frame_repr', False)
df = pd.read_csv('./titanic/titanic.csv')
print(df.head())
print(df.info())
print(df.describe)