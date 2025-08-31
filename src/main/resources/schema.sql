CREATE TABLE IF NOT EXISTS book
(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS account(
    id      BIGSERIAL PRIMARY KEY,
    name    VARCHAR(255)   NOT NULL,
    balance DECIMAL(15, 2) NOT NULL DEFAULT 10000.0,
    CONSTRAINT account_balance_non_negative CHECK (balance >= 0)
    );


