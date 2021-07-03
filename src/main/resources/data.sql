-- au premier lancement de l'appli : ddl-auto= create
-- lancements suivants : ddl-auto= update

insert into account (id, name, currency, trading_capital, trading_capital_after_last_trade) values (account_seq_id.nextval, 'IB Margin', 'EUR', 5000, 5000);

insert into trade (id, currency, stock_ticker, stock_name, marketplace, type, risk_type, screener, open_date, close_date, status, trading_capital_at_open, grade, stoploss, currency_rate, pv_mv, r_target, r_net, r_gross)
    values (trade_seq_id.nextval,'EUR', 'AAPL', 'APPLE', 'NASDAQ', 'Long', 'Yearly', 'LDM', '2021-02-04T12:45:30', null, 'En cours', 5000, 2, 54.2, 1.22, 5, 0.2, 0.3, 0.4);

insert into entry_order (id, entry_date, type, status, stop_price, entry_price, number_of_shares, fees)
    values (entry_order_seq_id.nextval, '2021-02-05T13:45:30', 'Pré BO', 'En attente', 5.21, 6.52, 5, 1.01);

insert into exit_order (id, exit_date, type, exit_price, number_of_shares, fees)
values (exit_order_seq_id.nextval, '2021-02-05T13:45:30', '1/2 R1', 10.58, 5, 1.12);


