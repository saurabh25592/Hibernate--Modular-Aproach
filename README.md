<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hibernate CRUD Operations with Modular Approach</title>
</head>
<body>

<h1>Hibernate CRUD Operations with Modular Approach</h1>

<p>This project demonstrates a simple CRUD (Create, Read, Update, Delete) application using Hibernate ORM with a modular approach. The project follows a layered architecture, separating entity, data access, service, and controller layers for better organization and maintainability.</p>

<h2>Project Structure</h2>

<pre>
- emp/
  - entity/
    - Employee.java           // Employee entity class
  - dao/
    - Employee_Dao.java       // Data access layer for CRUD operations
  - service/
    - Employee_Service.java   // Service layer that interacts with DAO
  - controller/
    - Main.java               // Main class (Controller) with a user interface
- hibernate.cfg.xml           // Hibernate configuration file
</pre>

<h2>Prerequisites</h2>
<ul>
    <li>Java Development Kit (JDK) 8 or higher</li>
    <li>Hibernate ORM 5.x or higher</li>
    <li>MySQL (or any preferred database)</li>
    <li>Database and table for employee data</li>
</ul>

<h2>Configuration</h2>
<ol>
    <li>Update the <code>hibernate.cfg.xml</code> file to configure your database connection.</li>
    <li>Add MySQL JDBC driver dependency to your project if using MySQL.</li>
</ol>

<h2>Code Overview</h2>

<h3>1. <code>Employee</code> Entity Class</h3>
<p>Located in <code>emp.entity</code>, this class represents the <code>Employee</code> entity with fields <code>emp_id</code>, <code>emp_name</code>, <code>address</code>, and <code>salary</code>. This class is mapped to a database table using JPA annotations.</p>

<h3>2. <code>Employee_Dao</code> Data Access Layer</h3>
<p>The DAO class, located in <code>emp.dao</code>, manages CRUD operations:</p>
<ul>
    <li><strong>Insert</strong>: Collects employee details from the user and inserts a new record.</li>
    <li><strong>Delete</strong>: Deletes a record by <code>emp_id</code>.</li>
    <li><strong>Update</strong>: Updates fields of an existing employee.</li>
    <li><strong>Fetch</strong>: Fetches and displays all employee records.</li>
</ul>

<h3>3. <code>Employee_Service</code> Service Layer</h3>
<p>Located in <code>emp.service</code>, the service layer calls the DAO methods and can contain additional business logic.</p>

<h3>4. <code>Main</code> Controller Class</h3>
<p>The <code>Main</code> class in <code>emp.controller</code> provides a basic user interface to:</p>
<ul>
    <li>Insert employee data</li>
    <li>Delete an employee record</li>
    <li>Update an employee's information</li>
    <li>Fetch all employee records</li>
</ul>

<h2>Usage</h2>
<p>Run the <code>Main</code> class and follow the on-screen prompts to perform CRUD operations:</p>
<ol>
    <li><strong>Option 1</strong>: Insert a new employee.</li>
    <li><strong>Option 2</strong>: Delete an existing employee.</li>
    <li><strong>Option 3</strong>: Update an employee's information.</li>
    <li><strong>Option 4</strong>: Fetch and display all employee records.</li>
    <li><strong>Option 5</strong>: Exit the application.</li>
</ol>

<h2>Example Commands</h2>

<h3>Insert</h3>
<p>Prompts the user to enter details such as <code>emp_id</code>, <code>emp_name</code>, <code>address</code>, and <code>salary</code>.</p>

<h3>Delete</h3>
<p>Removes an employee based on <code>emp_id</code>.</p>

<h3>Update</h3>
<p>Updates fields such as name, address, or salary for a specific employee.</p>

<h3>Fetch</h3>
<p>Displays all employees stored in the database.</p>

<h2>Dependencies</h2>
<p>To add dependencies, include the following Maven dependencies if using MySQL:</p>

<pre>
&lt;dependency&gt;
    &lt;groupId&gt;org.hibernate&lt;/groupId&gt;
    &lt;artifactId&gt;hibernate-core&lt;/artifactId&gt;
    &lt;version&gt;5.x.x&lt;/version&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
    &lt;groupId&gt;mysql&lt;/groupId&gt;
    &lt;artifactId&gt;mysql-connector-java&lt;/artifactId&gt;
    &lt;version&gt;8.x.x&lt;/version&gt;
&lt;/dependency&gt;
</pre>

<h2>License</h2>
<p>This project is open-source and can be modified or distributed under the MIT License.</p>

</body>
</html>
