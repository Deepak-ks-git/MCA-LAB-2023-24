import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import plotly.express as px
from sklearn.datasets import load_iris
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split

# Load example dataset (Iris dataset)
iris = load_iris()
iris_df = pd.DataFrame(data=np.c_[iris['data'], iris['target']], columns=iris['feature_names'] + ['target'])
iris_df['target'] = iris_df['target'].astype(int)

# Bar Chart
plt.figure(figsize=(8, 6))
sns.countplot(x='target', data=iris_df)
plt.title('Bar Chart: Iris Species Counts')
plt.show()

# Histogram
plt.figure(figsize=(10, 8))
sns.histplot(iris_df['sepal length (cm)'], bins=20, kde=True, color='skyblue')
plt.title('Histogram: Sepal Length Distribution')
plt.show()

# Box Plot
plt.figure(figsize=(10, 8))
sns.boxplot(x='target', y='sepal length (cm)', data=iris_df)
plt.title('Box Plot: Sepal Length by Iris Species')
plt.show()

# Scatter Plot
plt.figure(figsize=(10, 8))
sns.scatterplot(x='sepal length (cm)', y='sepal width (cm)', hue='target', data=iris_df)
plt.title('Scatter Plot: Sepal Length vs Sepal Width')
plt.show()

# Bubble Chart (using Plotly)
fig = px.scatter(iris_df, x='sepal length (cm)', y='sepal width (cm)', size='petal length (cm)', color='target',
                 labels={'sepal length (cm)': 'Sepal Length', 'sepal width (cm)': 'Sepal Width'},
                 title='Bubble Chart: Sepal Length vs Sepal Width with Petal Length as Size')
fig.show()

# Heatmap (Correlation Matrix)
correlation_matrix = iris_df.corr()
plt.figure(figsize=(10, 8))
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', linewidths=.5)
plt.title('Correlation Matrix Heatmap')
plt.show()

# Decision Tree Plot
# Let's create a simple decision tree for demonstration purposes
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target, test_size=0.2, random_state=42)
dt_classifier = DecisionTreeClassifier()
dt_classifier.fit(X_train, y_train)

plt.figure(figsize=(15, 10))
# You may need to install the 'graphviz' library for this, and make sure Graphviz is installed on your machine.
# Alternatively, you can export the tree to a file using export_graphviz and visualize it using an online tool.
# Here, I'm assuming that you have graphviz installed and configured.
from sklearn.tree import plot_tree
plot_tree(dt_classifier, feature_names=iris.feature_names, class_names=iris.target_names, filled=True)
plt.title('Decision Tree Visualization')
plt.show()

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import plotly.express as px
from sklearn.datasets import load_iris
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split

# Load example dataset (Iris dataset)
iris = load_iris()
iris_df = pd.DataFrame(data=np.c_[iris['data'], iris['target']], columns=iris['feature_names'] + ['target'])
iris_df['target'] = iris_df['target'].astype(int)

# Bar Chart
plt.figure(figsize=(8, 6))
sns.countplot(x='target', data=iris_df)
plt.title('Bar Chart: Iris Species Counts')
plt.show()

# Histogram
plt.figure(figsize=(10, 8))
sns.histplot(iris_df['sepal length (cm)'], bins=20, kde=True, color='skyblue')
plt.title('Histogram: Sepal Length Distribution')
plt.show()

# Box Plot
plt.figure(figsize=(10, 8))
sns.boxplot(x='target', y='sepal length (cm)', data=iris_df)
plt.title('Box Plot: Sepal Length by Iris Species')
plt.show()

# Scatter Plot
plt.figure(figsize=(10, 8))
sns.scatterplot(x='sepal length (cm)', y='sepal width (cm)', hue='target', data=iris_df)
plt.title('Scatter Plot: Sepal Length vs Sepal Width')
plt.show()

# Bubble Chart (using Plotly)
fig = px.scatter(iris_df, x='sepal length (cm)', y='sepal width (cm)', size='petal length (cm)', color='target',
                 labels={'sepal length (cm)': 'Sepal Length', 'sepal width (cm)': 'Sepal Width'},
                 title='Bubble Chart: Sepal Length vs Sepal Width with Petal Length as Size')
fig.show()

# Heatmap (Correlation Matrix)
correlation_matrix = iris_df.corr()
plt.figure(figsize=(10, 8))
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', linewidths=.5)
plt.title('Correlation Matrix Heatmap')
plt.show()

# Decision Tree Plot
# Let's create a simple decision tree for demonstration purposes
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target, test_size=0.2, random_state=42)
dt_classifier = DecisionTreeClassifier()
dt_classifier.fit(X_train, y_train)

plt.figure(figsize=(15, 10))
# You may need to install the 'graphviz' library for this, and make sure Graphviz is installed on your machine.
# Alternatively, you can export the tree to a file using export_graphviz and visualize it using an online tool.
# Here, I'm assuming that you have graphviz installed and configured.
from sklearn.tree import plot_tree
plot_tree(dt_classifier, feature_names=iris.feature_names, class_names=iris.target_names, filled=True)
plt.title('Decision Tree Visualization')
plt.show()

