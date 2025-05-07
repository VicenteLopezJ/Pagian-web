
-- Crear la tabla
CREATE TABLE client (
    id int IDENTITY NOT NULL,
    name varchar(50) NOT NULL,
    last_name varchar(100) NOT NULL,
    birthday_date date NOT NULL,
    document_type char(3) NOT NULL,
    number_document varchar(15) NOT NULL,
    cell_number char(9) NOT NULL,
    email varchar(100) NOT NULL,
    client_type char(2) NOT NULL,
    address varchar(100) NOT NULL,
    date date NOT NULL,
    state char(1) NOT NULL,
    CONSTRAINT client_pk PRIMARY KEY (id)
);

-- Crear la tabla proveedor
CREATE TABLE proveedor (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre_empresa VARCHAR(100) NOT NULL,
    ruc CHAR(11) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    gmail VARCHAR(100) NOT NULL,
    numero_celular CHAR(9) NOT NULL,
    state CHAR(1) NOT NULL
);