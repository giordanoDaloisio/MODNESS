## Structure

This folder contains the implementation of MODNESS.

The project is structured as follows:

- `metamodel`: This folder contains the EMF project with the modeling artifacts needed to generate the editor

- `metamodel.edit`: this project is automatically generated from the metamodel and contains the plugin utilities

- `metamodel.editor`: it contains the graphical utilities for the generated model editor

- `metamodel.tests`: it contains test classes for the generated editor

- `metamodel.runtime`: this folder contains the models produced using the editor. The models are stored in two folders: `models` contains the XML models generated using the traditional EMF visual editor, `DSL` contains the DSL models generated from the Xtext-based editor

- `org.eclipse.acceleo.fairness.generator`: this project contains the Acceleo template used to generate the fairness assessment code

- `org.xtext.example.modness`: this project contains the Xtext specification of the MODNESS DSL (inside `src.org.xtext.example.modness/Modness.xtext`)

- `org.xtext.example.modness.ide`, `org.xtext.example.modness.parent`, `org.xtext.example.modness.ui` : these projects are automatically generated from Xtext and contain the implementation of the DSL-based IDE
