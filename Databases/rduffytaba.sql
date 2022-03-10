-- Richard Duffy - Introduction To Databases TABA 2021
-- Question One - Section B
-- Create Tables
-- fig.1
CREATE TABLE suppliers
    (supplierId int(2) PRIMARY KEY AUTO_INCREMENT,
        sName varchar(20) NOT NULL,
        streetAddress varchar(30) NOT NULL,
        city varchar(30) NOT NULL,
        address3 varchar(30),
        country varchar(30) NOT NULL);

-- fig.2
CREATE TABLE customers
    (customerId int(4) PRIMARY KEY AUTO_INCREMENT,
        cName varchar(20) NOT NULL,
        streetAddress varchar(30) NOT NULL,
        city varchar(30) NOT NULL,
        address3 varchar(30),
        country varchar(30) NOT NULL);

-- fig.3
CREATE TABLE products
    (productId int(4) PRIMARY KEY AUTO_INCREMENT,
        supplierId int(2) NOT NULL,
        product varchar(20) NOT NULL,
        price decimal(5,2) NOT NULL,
        stock int(5) NOT NULL);

-- fig.4
CREATE TABLE orders
    (orderId int(5) PRIMARY KEY AUTO_INCREMENT,
        customerId int(4) NOT NULL,
        oDate date NOT NULL,
        oStatus varchar(10) NOT NULL);

-- fig.5
CREATE TABLE orderItems
    (orderId int(5),
    productId int(4),
    quantity int(4) NOT NULL,
    PRIMARY KEY(orderId,productId));

-- fig.6
CREATE TABLE staff
    (staffId int(4) PRIMARY KEY AUTO_INCREMENT,
        fName varchar(20) NOT NULL,
        lName varchar(20) NOT NULL,
        title varchar(20) NOT NULL,
        wage decimal(8,2) NOT NULL);


-- Populate tables
-- fig.7

-- Supppliers table
INSERT INTO suppliers (sName,streetAddress,city,address3,country)
    VALUES
        ("Orci","984 Rigney Alley","Twyford","Reading","United Kingdom");
INSERT INTO suppliers (sName,streetAddress,city,address3,country)
    VALUES
        ("Diam","07099 Hagan Terrace","Halton","Cheshire","United Kingdom");
INSERT INTO suppliers (sName,streetAddress,city,country)
    VALUES
        ("Pharetra","473 Burrows Center","Longford","Ireland");
INSERT INTO suppliers (sName,streetAddress,city,address3,country)
    VALUES
        ("Viverra","82 Crescent Oaks Circle","Tullamore","Co. Offaly","Ireland");

-- Customers table
INSERT INTO customers (cName,streetAddress,city,address3,country)
    VALUES
        ("Weatherhill","18 Garrison Pass","Crossmolina","Co. Mayo","Ireland");
INSERT INTO customers (cName,streetAddress,city,address3,country)
    VALUES
        ("Worley","3 Michigan Way","Southwark","London","United Kingdom");
INSERT INTO customers (cName,streetAddress,city,address3,country)
    VALUES
        ("Schule","76 Westerfield Street","Manorhamilton","Co. Leitrim","Ireland");
INSERT INTO customers (cName,streetAddress,city,address3,country)
    VALUES
        ("Greatbatch","2215 Huxley Alley","Upton","Co. Cork","Ireland");

-- Products table
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (4,"etiam",14.69,716);
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (4,"interdum mauris",23.68,348);
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (1,"odio elementum",28.69,94);
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (2,"sed nisl",23.61,611);
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (4,"vivamus",18.70,248);
INSERT INTO products (supplierId,product,price,stock)
    VALUES
        (3,"morbi non",20.70,2);

-- Orders table
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (2,"2021-01-30","dispatched");
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (1,"2021-04-05","paid");
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (4,"2021-05-07","paid");
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (4,"2021-05-15","dispatched");
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (3,"2021-03-02","unpaid");
INSERT INTO orders (customerId,oDate,oStatus)
    VALUES
        (4,"2021-01-18","paid");

-- OrderItems table
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (1,6,1);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (2,2,3);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (3,5,3);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (4,5,1);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (4,4,3);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (5,3,1);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (6,6,1);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (6,5,3);
INSERT INTO orderItems (orderId,productId,quantity)
    VALUES
        (6,1,2);

-- Staff table
INSERT INTO staff (fName,lName,title,wage)
    VALUES
        ("Jillane","Mixworthy","Salesperson",30245.00);
INSERT INTO staff (fName,lName,title,wage)
    VALUES
        ("Ambros","Guwer","Manager",37842.00);
INSERT INTO staff (fName,lName,title,wage)
    VALUES
        ("Pegeen","MacRinn","Salesperson",27438.00);


-- Create Foreign Keys
-- fig.8
ALTER TABLE products
    ADD FOREIGN KEY (supplierId) REFERENCES suppliers (supplierId);

ALTER TABLE orders
    ADD FOREIGN KEY (customerId) REFERENCES customers (customerId)
    ON DELETE CASCADE;

ALTER TABLE orderItems
    ADD FOREIGN KEY (orderId) REFERENCES orders (orderId)
    ON DELETE CASCADE;

ALTER TABLE orderItems
    ADD FOREIGN KEY (productId) REFERENCES products (productId);



-- Question Two

-- fig.9
CREATE VIEW ordersTotal AS
    SELECT SUM(i.quantity*p.price) AS itemTotal
        FROM orderItems i
        JOIN products p
        ON i.productId = p.productId
        WHERE i.orderID
        IN (SELECT orderId
            FROM orders
            WHERE oDate > NOW() - INTERVAL 30 DAY);
-- fig.10
SELECT * FROM ordersTotal;

-- fig.11
CREATE VIEW stocktake AS SELECT productId,product,stock FROM products WHERE stock <= 200;
-- fig.12
SELECT * FROM stocktake;

-- fig.13
CREATE VIEW forSupp AS SELECT supplierId,sName,country FROM suppliers WHERE country != "Ireland";
-- fig.14
SELECT * FROM forSupp;

-- fig.15
SELECT o.orderId,o.productId, p.product, o.quantity
    FROM orderItems o
    JOIN products p
    ON o.productId = p.productId
    ORDER BY o.orderId;

-- fig.16
CREATE VIEW sales AS
    SELECT productId, SUM(quantity) AS totalQuantity
        FROM orderItems
        WHERE productId
        IN (SELECT DISTINCT productId
            FROM orderItems)
        GROUP BY productId
        ORDER BY totalQuantity;
-- fig 17
SELECT * FROM sales;

-- fig.18
SELECT * FROM products WHERE stock >= 600 ORDER BY product;

-- fig.19
CREATE VIEW outstanding AS SELECT * FROM orders WHERE oStatus = "unpaid";
-- fig.20
SELECT * FROM outstanding;

-- fig.21
SELECT orderId FROM orders WHERE customerId = 4;
-- fig.22
SELECT i.*,o.customerId FROM orderItems i, orders o WHERE i.orderId = 4 AND o.orderId = i.orderId;

-- fig.23
UPDATE products SET price = 9.99 WHERE productId = 2;
UPDATE staff SET wage = ((wage/100)*105);
DELETE FROM orders WHERE oStatus = "unpaid" AND oDate < NOW() - INTERVAL 60 DAY;
UPDATE orders SET oStatus = "dispatched" WHERE oStatus = "paid";
-- fig.24
SELECT * FROM products;
-- fig.25
SELECT * FROM staff;
-- fig.26
SELECT * FROM orders;
