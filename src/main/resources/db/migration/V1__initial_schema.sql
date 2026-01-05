CREATE TABLE restaurants (
                             id SERIAL PRIMARY KEY,
                             name VARCHAR(255) NOT NULL,
                             city VARCHAR(100),
                             country VARCHAR(100),
                             phone VARCHAR(20),
                             email VARCHAR(100)
);

CREATE TABLE menu_items (
                            id SERIAL PRIMARY KEY,
                            restaurant_id BIGINT REFERENCES restaurants(id),
                            name VARCHAR(255) NOT NULL,
                            description TEXT,
                            price DECIMAL(10,2) NOT NULL,
                            currency VARCHAR(10) DEFAULT 'EUR',
                            active BOOLEAN DEFAULT TRUE
);

CREATE TABLE availability_slots (
                                    id SERIAL PRIMARY KEY,
                                    restaurant_id BIGINT REFERENCES restaurants(id),
                                    slot_date DATE NOT NULL,
                                    start_time TIME NOT NULL,
                                    end_time TIME NOT NULL,
                                    capacity INT NOT NULL,
                                    seats_available INT NOT NULL
);

-- Datos de prueba para el Escenario A
INSERT INTO restaurants (name, city, country, email) VALUES ('La Pizzeria', 'Madrid', 'España', 'piz@mail.com');
INSERT INTO availability_slots (restaurant_id, slot_date, start_time, end_time, capacity, seats_available)
VALUES (1, CURRENT_DATE + 1, '20:00:00', '22:00:00', 20, 20);