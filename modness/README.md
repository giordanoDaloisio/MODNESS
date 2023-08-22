## Structure

This folder contains the implementation of MODNESS.

The project is structured as follows:

- `metamodel`: This folder contains the EMF project with the modeling artifacts needed to generate the editor
- `metamodel.edit`: this project is automatically generated from the metamodel and contains the plugin utilities
- `metamodel.editor`: it contains the graphical utilities for the generated model editor
- `metamodel.tests`: it contains test classes for the generated editor
- `org.eclipse.acceleo.fairness.generator`: this project contains the Acceleo template used to generate the fairness assessment code
- `test`: this folder contains the produced models using the editor.
