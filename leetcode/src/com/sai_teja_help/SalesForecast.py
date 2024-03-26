import numpy as np
import pandas as pd
from sklearn.calibration import LabelEncoder
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score
from sklearn.model_selection import train_test_split


def mean_absolute_percentage_error(y_true, y_pred): 
    return np.mean(np.abs((y_true - y_pred) / y_true)) * 100

# load the Finals.xlsx dataset
df = pd.read_excel('Final.xlsx')


print(df.head())

le = LabelEncoder()
df['SKU'] = le.fit_transform(df['SKU'])
df['MARKET'] = le.fit_transform(df['MARKET'])

# Define the features and the target
X = df[['SKU', 'Salesweek', 'MARKET']]
y = df['Sales']

# Split the data into a training set and a test set
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create a random forest regressor
model = RandomForestRegressor(n_estimators=100, random_state=42)

# Train the model
model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = model.predict(X_test)

# Evaluate the model
mse = mean_squared_error(y_test, y_pred)
mape = mean_absolute_percentage_error(y_test, y_pred)

mae = mean_absolute_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print(f'Mean Squared Error: {mse}')
print(f'Mean Absolute Percentage Error: {mape}')
print(f'Mean Absolute Error: {mae}')
print(f'R^2: {r2}')

# Load the Scoring_Template.xlsx file
df_new = pd.read_excel('Scoring_Template.xlsx')

# Encode the 'SKU' and 'MARKET' columns
le = LabelEncoder()
df_new['SKU'] = le.fit_transform(df_new['SKU'])
df_new['MARKET'] = le.fit_transform(df_new['MARKET'])

# Define the features
X_new = df_new[['SKU', 'Salesweek', 'MARKET']]

# Make predictions on the new data
y_new_pred = model.predict(X_new)

# Convert the predictions to a DataFrame
predictions_new = pd.DataFrame(y_new_pred, columns=['Predicted Sales'])

# Add the predictions to the new DataFrame
df_new['Sales_new'] = predictions_new['Predicted Sales']

# Write the DataFrame back to the Excel file
df_new.to_excel('Scoring_Template.xlsx', index=False)





