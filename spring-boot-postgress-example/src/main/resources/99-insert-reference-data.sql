-- reference_type data
INSERT INTO reference_type(description, ref_type) VALUES ('Account Names', 'ACCOUNT');
INSERT INTO reference_type(description, ref_type) VALUES ('Currency', 'CURRENCY');
INSERT INTO reference_type(description, ref_type) VALUES ('Funding Type', 'FUNDING_TYPE');
INSERT INTO reference_type(description, ref_type) VALUES ('Counter Party', 'COUNTER_PARTY');
INSERT INTO reference_type(description, ref_type) VALUES ('Client Location', 'CLIENT_LOCATION');
INSERT INTO reference_type(description, ref_type) VALUES ('Trade Type', 'TRADE_TYPE');

-- reference_value data

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi SG Client', 'Citi SG Client', 'Citi SG Client', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi SG House', 'Citi SG House', 'Citi SG House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi AU House', 'Citi AU House', 'Citi AU House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi HK House', 'Citi HK House', 'Citi HK House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi JP House', 'Citi JP House', 'Citi JP House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACB Amsterdam', 'AACB Amsterdam', 'AACB Amsterdam', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACS', 'AACS', 'AACS', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACHK', 'AACHK', 'AACHK', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC SG House', 'HSBC SG House', 'HSBC SG House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC SG Client', 'HSBC SG Client', 'HSBC SG Client', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC HK House', 'HSBC HK House', 'HSBC HK House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Mizuho JP House', 'Mizuho JP House', 'Mizuho JP House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'ANZ AU House', 'ANZ AU House', 'ANZ AU House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'BAML SG House', 'BAML SG House', 'BAML SG House', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Korea', 'Korea', 'Korea', 'ACCOUNT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Taiwan', 'Taiwan', 'Taiwan', 'ACCOUNT');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CAD', 'CAD', 'CAD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CHF', 'CHF', 'CHF', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CNH', 'CNH', 'CNH', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'EUR', 'EUR', 'EUR', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'GBP', 'GBP', 'GBP', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HKD', 'HKD', 'HKD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'JPY', 'JPY', 'JPY', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'MYR', 'MYR', 'MYR', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'NZD', 'NZD', 'NZD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'SGD', 'SGD', 'SGD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'USD', 'USD', 'USD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AUD', 'AUD', 'AUD', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'KRW', 'KRW', 'KRW', 'CURRENCY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'TWD', 'TWD', 'TWD', 'CURRENCY');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACHK/FBXXX', 'AACHK/FBXXX', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACB/AACHK', 'AACB/AACHK', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'Funding', 'Funding', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACS Funding', 'AACS Funding', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACHK Funding', 'AACHK Funding', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACS Funding Bluefin', 'AACS Funding Bluefin', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACS Funding Eclipse', 'AACS Funding Eclipse', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'AACS Funding Optiver', 'AACS Funding Optiver', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'Adjustment', 'Adjustment', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'Bank Fees', 'Bank Fees', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'FX Swap', 'FX Swap', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'FBXXXX', 'FBXXXX', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'Margin', 'Margin', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'Omnibus', 'Omnibus', 'FUNDING_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, '', 'SGX Fees', 'SGX Fees', 'FUNDING_TYPE');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AAB', 'AAB', 'AAB', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AABSG', 'AABSG', 'AABSG', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACB', 'AACB', 'AACB', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CITIAU', 'CITIAU', 'CITIAU', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CITIHK', 'CITIHK', 'CITIHK', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CITIJP', 'CITIJP', 'CITIJP', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CITISG', 'CITISG', 'CITISG', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACS', 'AACS', 'AACS', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AABNV', 'AABNV', 'AABNV', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AABHK', 'AABHK', 'AABHK', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBCSG', 'HSBCSG', 'HSBCSG', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBCHK', 'HSBCHK', 'HSBCHK', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'MIZUHO', 'MIZUHO', 'MIZUHO', 'COUNTER_PARTY');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'ANZ', 'ANZ', 'ANZ', 'COUNTER_PARTY');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACBS', 'AACBS', 'AACBS', 'CLIENT_LOCATION');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACHK', 'AACHK', 'AACHK', 'CLIENT_LOCATION');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACT', 'AACT', 'AACT', 'CLIENT_LOCATION');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACS', 'AACS', 'AACS', 'CLIENT_LOCATION');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'B2B', 'B2B', 'B2B', 'TRADE_TYPE');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Liquidity', 'Liquidity', 'Liquidity', 'TRADE_TYPE');

-- cash report type
INSERT INTO reference_type(description, ref_type) VALUES ('CASH_REPORT_ACCT_GROUP_PARENT', 'CASH_REPORT_ACCT_GROUP_PARENT');
INSERT INTO reference_type(description, ref_type) VALUES ('CASH_REPORT_ACCT_GROUP_PARENT', 'CASH_REPORT_CURRENCY');
INSERT INTO reference_type(description, ref_type) VALUES ('CASH_REPORT_ACCT_GROUP_PARENT', 'CASH_REPORT_ACCT_GROUP_MAP');

-- cash report currency preferences
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'CASH_REPORT_CURRENCY', 'CASH_REPORT_CURRENCY', '"USD", "JPY", "SGD", "HKD", "AUD",  "GBP", "EUR", "CAD", "NZD", "CHF", "CNH" ', 'CASH_REPORT_CURRENCY');

-- cash report group account list 
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'APAC', 'APAC', '"ANZ House", "Citi Client", "Citibank House", "HSBC Client", "HSBC House", "Mizuho House", "BAML House", "NAB Money Market", "HSBK HK Money Market",	"HSBK SG Money Market", "AACS", "AACHK", "ANZ AU HOUSE"', 'CASH_REPORT_ACCT_GROUP_PARENT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACB', 'AACB', '"AAB CB Other O/N", "AAB CB Time Deposit"', 'CASH_REPORT_ACCT_GROUP_PARENT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AABSG', 'AABSG', '"AAB SG Other O/N", "AAB SG Other Time Deposit"', 'CASH_REPORT_ACCT_GROUP_PARENT');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AABNL', 'AABNL', '"AAB NL Other O/N", "AAB NL Other Time Deposit"', 'CASH_REPORT_ACCT_GROUP_PARENT');



-- cash report account mapping
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'ANZ AU House:ANZ House',   'ANZ AU House',  'ANZ House',  'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi SG Client:Citi Client', 'Citi SG Client', 'Citi Client', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi AU House:Citibank House', 'Citi AU House', 'Citibank House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi HK House:Citibank House', 'Citi HK House', 'Citibank House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi JP House:Citibank House', 'Citi JP House', 'Citibank House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Citi SG House:Citibank House', 'Citi SG House', 'Citibank House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC SG Client:HSBC Client', 'HSBC SG Client', 'HSBC Client', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC HK House:HSBC House', 'HSBC HK House', 'HSBC House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'HSBC SG House:HSBC House', 'HSBC SG House', 'HSBC House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'Mizuho JP House:Mizuho House', 'Mizuho JP House', 'Mizuho House', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'BAML SG House:BAML House', 'BAML SG House', 'BAML House', 'CASH_REPORT_ACCT_GROUP_MAP');

INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACS:AAB CB Time Deposit', 'AACS', 'AAB CB Time Deposit', 'CASH_REPORT_ACCT_GROUP_MAP');


INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACB Amsterdam:AAB CB Other O/N', 'AACB Amsterdam', 'AAB CB Other O/N', 'CASH_REPORT_ACCT_GROUP_MAP');
INSERT INTO reference_value(alt_sequence, description, key, value, ref_type) VALUES (0, 'AACHK:AAB SG Other O/N', 'AACHK', 'AAB SG Other O/N', 'CASH_REPORT_ACCT_GROUP_MAP');

