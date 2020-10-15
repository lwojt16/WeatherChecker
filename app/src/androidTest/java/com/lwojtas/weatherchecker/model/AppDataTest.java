package com.lwojtas.weatherchecker.model;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppDataTest {

    static final String APP_DATA = "{\"settings\":{\"units\":1,\"decimals\":0,\"preciseDecimals\":2,\"weatherActualThreshold\":24,\"locale\":\"en\",\"updateMode\":0,\"timeout\":10000,\"threadPool\":10,\"appID\":\"\",\"logMode\":10000},\"cities\":[{\"name\":\"San Francisco\",\"lat\":37.78,\"lon\":-122.42,\"timezone\":\"GMT\",\"current\":{\"dt\":1602500700,\"pressure\":1020,\"humidity\":67,\"dew_point\":8.88,\"clouds\":1,\"wind_speed\":2.1,\"wind_deg\":220,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"sunrise\":1602512137,\"sunset\":1602552963,\"temp\":14.95,\"feels_like\":13.23,\"uvi\":5.09,\"visibility\":10000},\"minutely\":[{\"dt\":1602500700,\"precipitation\":0},{\"dt\":1602500760,\"precipitation\":0},{\"dt\":1602500820,\"precipitation\":0},{\"dt\":1602500880,\"precipitation\":0},{\"dt\":1602500940,\"precipitation\":0},{\"dt\":1602501000,\"precipitation\":0},{\"dt\":1602501060,\"precipitation\":0},{\"dt\":1602501120,\"precipitation\":0},{\"dt\":1602501180,\"precipitation\":0},{\"dt\":1602501240,\"precipitation\":0},{\"dt\":1602501300,\"precipitation\":0},{\"dt\":1602501360,\"precipitation\":0},{\"dt\":1602501420,\"precipitation\":0},{\"dt\":1602501480,\"precipitation\":0},{\"dt\":1602501540,\"precipitation\":0},{\"dt\":1602501600,\"precipitation\":0},{\"dt\":1602501660,\"precipitation\":0},{\"dt\":1602501720,\"precipitation\":0},{\"dt\":1602501780,\"precipitation\":0},{\"dt\":1602501840,\"precipitation\":0},{\"dt\":1602501900,\"precipitation\":0},{\"dt\":1602501960,\"precipitation\":0},{\"dt\":1602502020,\"precipitation\":0},{\"dt\":1602502080,\"precipitation\":0},{\"dt\":1602502140,\"precipitation\":0},{\"dt\":1602502200,\"precipitation\":0},{\"dt\":1602502260,\"precipitation\":0},{\"dt\":1602502320,\"precipitation\":0},{\"dt\":1602502380,\"precipitation\":0},{\"dt\":1602502440,\"precipitation\":0},{\"dt\":1602502500,\"precipitation\":0},{\"dt\":1602502560,\"precipitation\":0},{\"dt\":1602502620,\"precipitation\":0},{\"dt\":1602502680,\"precipitation\":0},{\"dt\":1602502740,\"precipitation\":0},{\"dt\":1602502800,\"precipitation\":0},{\"dt\":1602502860,\"precipitation\":0},{\"dt\":1602502920,\"precipitation\":0},{\"dt\":1602502980,\"precipitation\":0},{\"dt\":1602503040,\"precipitation\":0},{\"dt\":1602503100,\"precipitation\":0},{\"dt\":1602503160,\"precipitation\":0},{\"dt\":1602503220,\"precipitation\":0},{\"dt\":1602503280,\"precipitation\":0},{\"dt\":1602503340,\"precipitation\":0},{\"dt\":1602503400,\"precipitation\":0},{\"dt\":1602503460,\"precipitation\":0},{\"dt\":1602503520,\"precipitation\":0},{\"dt\":1602503580,\"precipitation\":0},{\"dt\":1602503640,\"precipitation\":0},{\"dt\":1602503700,\"precipitation\":0},{\"dt\":1602503760,\"precipitation\":0},{\"dt\":1602503820,\"precipitation\":0},{\"dt\":1602503880,\"precipitation\":0},{\"dt\":1602503940,\"precipitation\":0},{\"dt\":1602504000,\"precipitation\":0},{\"dt\":1602504060,\"precipitation\":0},{\"dt\":1602504120,\"precipitation\":0},{\"dt\":1602504180,\"precipitation\":0},{\"dt\":1602504240,\"precipitation\":0},{\"dt\":1602504300,\"precipitation\":0}],\"hourly\":[{\"dt\":1602500400,\"pressure\":1020,\"humidity\":67,\"dew_point\":8.88,\"clouds\":1,\"wind_speed\":0.74,\"wind_deg\":345,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":14.95,\"feels_like\":14.18,\"visibility\":10000,\"pop\":0},{\"dt\":1602504000,\"pressure\":1020,\"humidity\":66,\"dew_point\":8.86,\"clouds\":1,\"wind_speed\":0.7,\"wind_deg\":2,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.16,\"feels_like\":14.41,\"visibility\":10000,\"pop\":0},{\"dt\":1602507600,\"pressure\":1019,\"humidity\":65,\"dew_point\":8.69,\"clouds\":0,\"wind_speed\":0.61,\"wind_deg\":27,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.22,\"feels_like\":14.5,\"visibility\":10000,\"pop\":0},{\"dt\":1602511200,\"pressure\":1019,\"humidity\":65,\"dew_point\":8.65,\"clouds\":0,\"wind_speed\":0.64,\"wind_deg\":33,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.18,\"feels_like\":14.42,\"visibility\":10000,\"pop\":0},{\"dt\":1602514800,\"pressure\":1019,\"humidity\":63,\"dew_point\":8.62,\"clouds\":0,\"wind_speed\":0.85,\"wind_deg\":38,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":15.63,\"feels_like\":14.72,\"visibility\":10000,\"pop\":0},{\"dt\":1602518400,\"pressure\":1020,\"humidity\":57,\"dew_point\":8.52,\"clouds\":0,\"wind_speed\":1.09,\"wind_deg\":34,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":16.9,\"feels_like\":15.75,\"visibility\":10000,\"pop\":0},{\"dt\":1602522000,\"pressure\":1020,\"humidity\":52,\"dew_point\":8.22,\"clouds\":1,\"wind_speed\":1.56,\"wind_deg\":17,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":18.18,\"feels_like\":16.66,\"visibility\":10000,\"pop\":0},{\"dt\":1602525600,\"pressure\":1020,\"humidity\":47,\"dew_point\":7.89,\"clouds\":0,\"wind_speed\":1.8,\"wind_deg\":14,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":19.26,\"feels_like\":17.46,\"visibility\":10000,\"pop\":0},{\"dt\":1602529200,\"pressure\":1019,\"humidity\":44,\"dew_point\":7.73,\"clouds\":0,\"wind_speed\":1.76,\"wind_deg\":348,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.18,\"feels_like\":18.37,\"visibility\":10000,\"pop\":0},{\"dt\":1602532800,\"pressure\":1019,\"humidity\":42,\"dew_point\":7.62,\"clouds\":1,\"wind_speed\":2.56,\"wind_deg\":310,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.83,\"feels_like\":18.44,\"visibility\":10000,\"pop\":0},{\"dt\":1602536400,\"pressure\":1018,\"humidity\":43,\"dew_point\":8.07,\"clouds\":1,\"wind_speed\":3.32,\"wind_deg\":292,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.97,\"feels_like\":18.16,\"visibility\":10000,\"pop\":0},{\"dt\":1602540000,\"pressure\":1017,\"humidity\":45,\"dew_point\":8.64,\"clouds\":1,\"wind_speed\":3.67,\"wind_deg\":285,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.78,\"feels_like\":17.84,\"visibility\":10000,\"pop\":0},{\"dt\":1602543600,\"pressure\":1017,\"humidity\":47,\"dew_point\":9.28,\"clouds\":1,\"wind_speed\":3.93,\"wind_deg\":280,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.67,\"feels_like\":17.69,\"visibility\":10000,\"pop\":0},{\"dt\":1602547200,\"pressure\":1016,\"humidity\":53,\"dew_point\":10.49,\"clouds\":1,\"wind_speed\":3.71,\"wind_deg\":274,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.11,\"feels_like\":17.62,\"visibility\":10000,\"pop\":0},{\"dt\":1602550800,\"pressure\":1016,\"humidity\":61,\"dew_point\":11.38,\"clouds\":16,\"wind_speed\":3.55,\"wind_deg\":266,\"weather\":[{\"description\":\"Few Clouds\",\"icon\":\"02d\"}],\"temp\":19.05,\"feels_like\":16.99,\"visibility\":10000,\"pop\":0},{\"dt\":1602554400,\"pressure\":1016,\"humidity\":68,\"dew_point\":11.9,\"clouds\":12,\"wind_speed\":3.08,\"wind_deg\":265,\"weather\":[{\"description\":\"Few Clouds\",\"icon\":\"02n\"}],\"temp\":17.67,\"feels_like\":16.04,\"visibility\":10000,\"pop\":0},{\"dt\":1602558000,\"pressure\":1016,\"humidity\":72,\"dew_point\":12.12,\"clouds\":9,\"wind_speed\":2.2,\"wind_deg\":259,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.15,\"feels_like\":16.25,\"visibility\":10000,\"pop\":0},{\"dt\":1602561600,\"pressure\":1017,\"humidity\":73,\"dew_point\":12.23,\"clouds\":7,\"wind_speed\":1.37,\"wind_deg\":236,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.91,\"feels_like\":16.58,\"visibility\":10000,\"pop\":0},{\"dt\":1602565200,\"pressure\":1017,\"humidity\":74,\"dew_point\":12.21,\"clouds\":6,\"wind_speed\":0.92,\"wind_deg\":221,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.83,\"feels_like\":16.86,\"visibility\":10000,\"pop\":0},{\"dt\":1602568800,\"pressure\":1017,\"humidity\":75,\"dew_point\":12.18,\"clouds\":5,\"wind_speed\":0.1,\"wind_deg\":237,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.59,\"feels_like\":17.18,\"visibility\":10000,\"pop\":0},{\"dt\":1602572400,\"pressure\":1017,\"humidity\":76,\"dew_point\":12.17,\"clouds\":0,\"wind_speed\":0.24,\"wind_deg\":287,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.38,\"feels_like\":16.87,\"visibility\":10000,\"pop\":0},{\"dt\":1602576000,\"pressure\":1017,\"humidity\":76,\"dew_point\":12.04,\"clouds\":0,\"wind_speed\":0.6,\"wind_deg\":279,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.23,\"feels_like\":16.43,\"visibility\":10000,\"pop\":0},{\"dt\":1602579600,\"pressure\":1016,\"humidity\":76,\"dew_point\":11.93,\"clouds\":0,\"wind_speed\":0.66,\"wind_deg\":257,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":16.06,\"feels_like\":16.17,\"visibility\":10000,\"pop\":0},{\"dt\":1602583200,\"pressure\":1017,\"humidity\":77,\"dew_point\":11.83,\"clouds\":0,\"wind_speed\":0.83,\"wind_deg\":280,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.82,\"feels_like\":15.8,\"visibility\":10000,\"pop\":0},{\"dt\":1602586800,\"pressure\":1017,\"humidity\":77,\"dew_point\":11.76,\"clouds\":0,\"wind_speed\":0.27,\"wind_deg\":345,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.63,\"feels_like\":15.94,\"visibility\":10000,\"pop\":0},{\"dt\":1602590400,\"pressure\":1017,\"humidity\":77,\"dew_point\":11.7,\"clouds\":0,\"wind_speed\":0.14,\"wind_deg\":63,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.57,\"feels_like\":15.96,\"visibility\":10000,\"pop\":0},{\"dt\":1602594000,\"pressure\":1017,\"humidity\":77,\"dew_point\":11.59,\"clouds\":0,\"wind_speed\":0.66,\"wind_deg\":15,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.55,\"feels_like\":15.57,\"visibility\":10000,\"pop\":0},{\"dt\":1602597600,\"pressure\":1018,\"humidity\":76,\"dew_point\":11.56,\"clouds\":0,\"wind_speed\":1.13,\"wind_deg\":50,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":15.59,\"feels_like\":15.23,\"visibility\":10000,\"pop\":0},{\"dt\":1602601200,\"pressure\":1018,\"humidity\":74,\"dew_point\":11.46,\"clouds\":0,\"wind_speed\":1.2,\"wind_deg\":12,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":15.95,\"feels_like\":15.53,\"visibility\":10000,\"pop\":0},{\"dt\":1602604800,\"pressure\":1019,\"humidity\":68,\"dew_point\":11.29,\"clouds\":0,\"wind_speed\":1.51,\"wind_deg\":3,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":17.17,\"feels_like\":16.5,\"visibility\":10000,\"pop\":0},{\"dt\":1602608400,\"pressure\":1019,\"humidity\":61,\"dew_point\":10.95,\"clouds\":0,\"wind_speed\":1.77,\"wind_deg\":5,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":18.39,\"feels_like\":17.4,\"visibility\":10000,\"pop\":0},{\"dt\":1602612000,\"pressure\":1019,\"humidity\":55,\"dew_point\":10.41,\"clouds\":0,\"wind_speed\":1.5,\"wind_deg\":353,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":19.45,\"feels_like\":18.49,\"visibility\":10000,\"pop\":0},{\"dt\":1602615600,\"pressure\":1019,\"humidity\":50,\"dew_point\":9.91,\"clouds\":0,\"wind_speed\":1.66,\"wind_deg\":310,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.45,\"feels_like\":19.24,\"visibility\":10000,\"pop\":0},{\"dt\":1602619200,\"pressure\":1018,\"humidity\":49,\"dew_point\":9.7,\"clouds\":0,\"wind_speed\":2.89,\"wind_deg\":289,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.7,\"feels_like\":18.61,\"visibility\":10000,\"pop\":0},{\"dt\":1602622800,\"pressure\":1018,\"humidity\":47,\"dew_point\":9.69,\"clouds\":0,\"wind_speed\":3.22,\"wind_deg\":278,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":21.16,\"feels_like\":18.79,\"visibility\":10000,\"pop\":0},{\"dt\":1602626400,\"pressure\":1017,\"humidity\":48,\"dew_point\":9.89,\"clouds\":0,\"wind_speed\":3.71,\"wind_deg\":270,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":21.1,\"feels_like\":18.46,\"visibility\":10000,\"pop\":0},{\"dt\":1602630000,\"pressure\":1017,\"humidity\":52,\"dew_point\":10.4,\"clouds\":0,\"wind_speed\":3.97,\"wind_deg\":264,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":20.41,\"feels_like\":17.74,\"visibility\":10000,\"pop\":0},{\"dt\":1602633600,\"pressure\":1017,\"humidity\":59,\"dew_point\":11.55,\"clouds\":0,\"wind_speed\":3.97,\"wind_deg\":262,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":19.56,\"feels_like\":17.2,\"visibility\":10000,\"pop\":0},{\"dt\":1602637200,\"pressure\":1017,\"humidity\":65,\"dew_point\":12.15,\"clouds\":0,\"wind_speed\":3.24,\"wind_deg\":263,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"temp\":18.85,\"feels_like\":17.24,\"visibility\":10000,\"pop\":0},{\"dt\":1602640800,\"pressure\":1017,\"humidity\":68,\"dew_point\":12.24,\"clouds\":0,\"wind_speed\":2.47,\"wind_deg\":275,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":18.08,\"feels_like\":16.99,\"visibility\":10000,\"pop\":0},{\"dt\":1602644400,\"pressure\":1018,\"humidity\":69,\"dew_point\":12.25,\"clouds\":0,\"wind_speed\":1.49,\"wind_deg\":282,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.81,\"feels_like\":17.4,\"visibility\":10000,\"pop\":0},{\"dt\":1602648000,\"pressure\":1018,\"humidity\":69,\"dew_point\":12.15,\"clouds\":0,\"wind_speed\":0.89,\"wind_deg\":270,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.79,\"feels_like\":17.79,\"visibility\":10000,\"pop\":0},{\"dt\":1602651600,\"pressure\":1018,\"humidity\":69,\"dew_point\":12,\"clouds\":0,\"wind_speed\":0.62,\"wind_deg\":270,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.68,\"feels_like\":17.84,\"visibility\":10000,\"pop\":0},{\"dt\":1602655200,\"pressure\":1019,\"humidity\":69,\"dew_point\":11.89,\"clouds\":0,\"wind_speed\":0.41,\"wind_deg\":285,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.44,\"feels_like\":17.68,\"visibility\":10000,\"pop\":0},{\"dt\":1602658800,\"pressure\":1018,\"humidity\":69,\"dew_point\":11.77,\"clouds\":0,\"wind_speed\":0.44,\"wind_deg\":305,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.36,\"feels_like\":17.56,\"visibility\":10000,\"pop\":0},{\"dt\":1602662400,\"pressure\":1018,\"humidity\":69,\"dew_point\":11.66,\"clouds\":0,\"wind_speed\":0.68,\"wind_deg\":337,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.3,\"feels_like\":17.31,\"visibility\":10000,\"pop\":0},{\"dt\":1602666000,\"pressure\":1018,\"humidity\":67,\"dew_point\":11.51,\"clouds\":0,\"wind_speed\":1.36,\"wind_deg\":27,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.59,\"feels_like\":17.07,\"visibility\":10000,\"pop\":0},{\"dt\":1602669600,\"pressure\":1018,\"humidity\":68,\"dew_point\":11.43,\"clouds\":0,\"wind_speed\":0.81,\"wind_deg\":23,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01n\"}],\"temp\":17.36,\"feels_like\":17.23,\"visibility\":10000,\"pop\":0}],\"daily\":[{\"dt\":1602529200,\"pressure\":1020,\"humidity\":48,\"dew_point\":7.74,\"clouds\":0,\"wind_speed\":1.8,\"wind_deg\":14,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602512137,\"sunset\":1602552963,\"temp\":{\"day\":18.98,\"min\":14.95,\"max\":20.92,\"night\":16.59,\"eve\":20.11,\"morn\":15.16},\"feels_like\":{\"morn\":14.41,\"day\":17.19,\"eve\":17.62,\"night\":17.18},\"uvi\":5.09,\"pop\":0},{\"dt\":1602615600,\"pressure\":1019,\"humidity\":55,\"dew_point\":10.41,\"clouds\":0,\"wind_speed\":1.5,\"wind_deg\":353,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602598593,\"sunset\":1602639277,\"temp\":{\"day\":19.45,\"min\":15.57,\"max\":21.16,\"night\":17.44,\"eve\":19.56,\"morn\":15.57},\"feels_like\":{\"morn\":15.96,\"day\":18.49,\"eve\":17.2,\"night\":17.68},\"uvi\":5.21,\"pop\":0},{\"dt\":1602702000,\"pressure\":1018,\"humidity\":46,\"dew_point\":9.47,\"clouds\":0,\"wind_speed\":1.16,\"wind_deg\":337,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602685050,\"sunset\":1602725593,\"temp\":{\"day\":21.4,\"min\":17.51,\"max\":22.67,\"night\":19.12,\"eve\":20.53,\"morn\":17.51},\"feels_like\":{\"morn\":16.84,\"day\":20.45,\"eve\":17.98,\"night\":18.12},\"uvi\":5.15,\"pop\":0},{\"dt\":1602788400,\"pressure\":1016,\"humidity\":24,\"dew_point\":0.9,\"clouds\":0,\"wind_speed\":2.79,\"wind_deg\":61,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602771507,\"sunset\":1602811909,\"temp\":{\"day\":22.39,\"min\":18.7,\"max\":25.57,\"night\":20.32,\"eve\":25.07,\"morn\":19.16},\"feels_like\":{\"morn\":15.6,\"day\":18.58,\"eve\":22.17,\"night\":18.84},\"uvi\":4.93,\"pop\":0},{\"dt\":1602874800,\"pressure\":1015,\"humidity\":24,\"dew_point\":1.59,\"clouds\":0,\"wind_speed\":2.93,\"wind_deg\":48,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602857964,\"sunset\":1602898226,\"temp\":{\"day\":23.26,\"min\":19.45,\"max\":26.66,\"night\":20.39,\"eve\":25.76,\"morn\":20.01},\"feels_like\":{\"morn\":16.52,\"day\":19.46,\"eve\":22.49,\"night\":18.95},\"uvi\":4.8,\"pop\":0},{\"dt\":1602961200,\"pressure\":1013,\"humidity\":27,\"dew_point\":3.43,\"clouds\":0,\"wind_speed\":2.87,\"wind_deg\":42,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602944422,\"sunset\":1602984544,\"temp\":{\"day\":23.27,\"min\":18.91,\"max\":26.42,\"night\":18.91,\"eve\":24.42,\"morn\":19.95},\"feels_like\":{\"morn\":17.55,\"day\":19.8,\"eve\":20.38,\"night\":16.74},\"uvi\":4.59,\"pop\":0},{\"dt\":1603047600,\"pressure\":1018,\"humidity\":48,\"dew_point\":9.1,\"clouds\":0,\"wind_speed\":2.41,\"wind_deg\":213,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1603030881,\"sunset\":1603070864,\"temp\":{\"day\":20.44,\"min\":16.45,\"max\":20.76,\"night\":16.45,\"eve\":19.05,\"morn\":17.45},\"feels_like\":{\"morn\":16.12,\"day\":18.55,\"eve\":16.67,\"night\":15.93},\"uvi\":4.82,\"pop\":0},{\"dt\":1603134000,\"pressure\":1020,\"humidity\":77,\"dew_point\":13.73,\"clouds\":91,\"wind_speed\":3.82,\"wind_deg\":275,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"sunrise\":1603117339,\"sunset\":1603157183,\"temp\":{\"day\":17.64,\"min\":16.34,\"max\":17.85,\"night\":17.16,\"eve\":17.16,\"morn\":16.66},\"feels_like\":{\"morn\":16.3,\"day\":16.08,\"eve\":13.92,\"night\":13.92},\"uvi\":4.53,\"pop\":0.11}]},{\"name\":\"Warsaw\",\"lat\":52.23,\"lon\":21.01,\"timezone\":\"Europe\\/Warsaw\",\"current\":{\"dt\":1602574652,\"pressure\":1011,\"humidity\":100,\"dew_point\":6.66,\"clouds\":75,\"wind_speed\":4.1,\"wind_deg\":10,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10d\"}],\"sunrise\":1602565066,\"sunset\":1602603969,\"temp\":6.66,\"feels_like\":3.02,\"uvi\":1.69,\"visibility\":10000,\"rain\":{\"1h\":4.01}},\"minutely\":[{\"dt\":1602574680,\"precipitation\":4.0108},{\"dt\":1602574740,\"precipitation\":4.4364},{\"dt\":1602574800,\"precipitation\":4.862},{\"dt\":1602574860,\"precipitation\":4.862},{\"dt\":1602574920,\"precipitation\":4.862},{\"dt\":1602574980,\"precipitation\":4.862},{\"dt\":1602575040,\"precipitation\":4.862},{\"dt\":1602575100,\"precipitation\":4.862},{\"dt\":1602575160,\"precipitation\":4.862},{\"dt\":1602575220,\"precipitation\":4.862},{\"dt\":1602575280,\"precipitation\":4.862},{\"dt\":1602575340,\"precipitation\":4.862},{\"dt\":1602575400,\"precipitation\":4.862},{\"dt\":1602575460,\"precipitation\":4.6188},{\"dt\":1602575520,\"precipitation\":4.3756},{\"dt\":1602575580,\"precipitation\":4.1324},{\"dt\":1602575640,\"precipitation\":3.8891999999999998},{\"dt\":1602575700,\"precipitation\":3.646},{\"dt\":1602575760,\"precipitation\":3.4636},{\"dt\":1602575820,\"precipitation\":3.2812},{\"dt\":1602575880,\"precipitation\":3.0987999999999998},{\"dt\":1602575940,\"precipitation\":2.9164},{\"dt\":1602576000,\"precipitation\":2.734},{\"dt\":1602576060,\"precipitation\":2.8188},{\"dt\":1602576120,\"precipitation\":2.9036},{\"dt\":1602576180,\"precipitation\":2.9884},{\"dt\":1602576240,\"precipitation\":3.0732},{\"dt\":1602576300,\"precipitation\":3.158},{\"dt\":1602576360,\"precipitation\":3.158},{\"dt\":1602576420,\"precipitation\":3.158},{\"dt\":1602576480,\"precipitation\":3.158},{\"dt\":1602576540,\"precipitation\":3.158},{\"dt\":1602576600,\"precipitation\":3.158},{\"dt\":1602576660,\"precipitation\":2.9364},{\"dt\":1602576720,\"precipitation\":2.7148},{\"dt\":1602576780,\"precipitation\":2.4932},{\"dt\":1602576840,\"precipitation\":2.2716},{\"dt\":1602576900,\"precipitation\":2.05},{\"dt\":1602576960,\"precipitation\":2.05},{\"dt\":1602577020,\"precipitation\":2.05},{\"dt\":1602577080,\"precipitation\":2.05},{\"dt\":1602577140,\"precipitation\":2.05},{\"dt\":1602577200,\"precipitation\":2.05},{\"dt\":1602577260,\"precipitation\":2.05},{\"dt\":1602577320,\"precipitation\":2.05},{\"dt\":1602577380,\"precipitation\":2.05},{\"dt\":1602577440,\"precipitation\":2.05},{\"dt\":1602577500,\"precipitation\":2.05},{\"dt\":1602577560,\"precipitation\":2.05},{\"dt\":1602577620,\"precipitation\":2.05},{\"dt\":1602577680,\"precipitation\":2.05},{\"dt\":1602577740,\"precipitation\":2.05},{\"dt\":1602577800,\"precipitation\":2.05},{\"dt\":1602577860,\"precipitation\":1.9951999999999999},{\"dt\":1602577920,\"precipitation\":1.9404},{\"dt\":1602577980,\"precipitation\":1.8856},{\"dt\":1602578040,\"precipitation\":1.8308},{\"dt\":1602578100,\"precipitation\":1.776},{\"dt\":1602578160,\"precipitation\":1.8944},{\"dt\":1602578220,\"precipitation\":2.0128},{\"dt\":1602578280,\"precipitation\":2.1311999999999998}],\"hourly\":[{\"dt\":1602572400,\"pressure\":1011,\"humidity\":100,\"dew_point\":6.66,\"clouds\":75,\"wind_speed\":4.69,\"wind_deg\":14,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":6.66,\"feels_like\":2.6,\"visibility\":10000,\"pop\":0.58,\"rain\":{\"1h\":0.23}},{\"dt\":1602576000,\"pressure\":1011,\"humidity\":93,\"dew_point\":6.02,\"clouds\":87,\"wind_speed\":5.2,\"wind_deg\":15,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10d\"}],\"temp\":7.07,\"feels_like\":2.52,\"visibility\":10000,\"pop\":0.85,\"rain\":{\"1h\":2.73}},{\"dt\":1602579600,\"pressure\":1012,\"humidity\":89,\"dew_point\":5.79,\"clouds\":95,\"wind_speed\":5.2,\"wind_deg\":23,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10d\"}],\"temp\":7.48,\"feels_like\":2.88,\"visibility\":10000,\"pop\":0.93,\"rain\":{\"1h\":7.49}},{\"dt\":1602583200,\"pressure\":1011,\"humidity\":86,\"dew_point\":5.54,\"clouds\":98,\"wind_speed\":6.12,\"wind_deg\":24,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10d\"}],\"temp\":7.73,\"feels_like\":2.43,\"visibility\":10000,\"pop\":0.96,\"rain\":{\"1h\":1.33}},{\"dt\":1602586800,\"pressure\":1010,\"humidity\":85,\"dew_point\":5.69,\"clouds\":100,\"wind_speed\":6.55,\"wind_deg\":26,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":8.06,\"feels_like\":2.49,\"visibility\":10000,\"pop\":0.76},{\"dt\":1602590400,\"pressure\":1009,\"humidity\":85,\"dew_point\":5.87,\"clouds\":100,\"wind_speed\":7.31,\"wind_deg\":27,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":8.18,\"feels_like\":2.1,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":0.24}},{\"dt\":1602594000,\"pressure\":1009,\"humidity\":85,\"dew_point\":6.01,\"clouds\":100,\"wind_speed\":7.42,\"wind_deg\":33,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":8.32,\"feels_like\":2.2,\"visibility\":10000,\"pop\":0.88,\"rain\":{\"1h\":0.31}},{\"dt\":1602597600,\"pressure\":1008,\"humidity\":86,\"dew_point\":6.26,\"clouds\":100,\"wind_speed\":7.53,\"wind_deg\":37,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":8.46,\"feels_like\":2.33,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":0.4}},{\"dt\":1602601200,\"pressure\":1007,\"humidity\":88,\"dew_point\":6.78,\"clouds\":100,\"wind_speed\":7.57,\"wind_deg\":37,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10d\"}],\"temp\":8.53,\"feels_like\":2.46,\"visibility\":7217,\"pop\":1,\"rain\":{\"1h\":1.36}},{\"dt\":1602604800,\"pressure\":1006,\"humidity\":89,\"dew_point\":7.24,\"clouds\":100,\"wind_speed\":7.78,\"wind_deg\":35,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":8.79,\"feels_like\":2.66,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":1.93}},{\"dt\":1602608400,\"pressure\":1004,\"humidity\":91,\"dew_point\":7.57,\"clouds\":100,\"wind_speed\":7.75,\"wind_deg\":38,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":8.91,\"feels_like\":2.91,\"visibility\":6097,\"pop\":1,\"rain\":{\"1h\":1.81}},{\"dt\":1602612000,\"pressure\":1004,\"humidity\":91,\"dew_point\":8.08,\"clouds\":100,\"wind_speed\":8.14,\"wind_deg\":42,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":9.44,\"feels_like\":3.29,\"visibility\":6043,\"pop\":1,\"rain\":{\"1h\":2.43}},{\"dt\":1602615600,\"pressure\":1002,\"humidity\":91,\"dew_point\":8.48,\"clouds\":100,\"wind_speed\":8.33,\"wind_deg\":43,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":9.84,\"feels_like\":3.65,\"visibility\":5399,\"pop\":1,\"rain\":{\"1h\":2.29}},{\"dt\":1602619200,\"pressure\":1001,\"humidity\":90,\"dew_point\":8.72,\"clouds\":100,\"wind_speed\":9.23,\"wind_deg\":43,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":10.13,\"feels_like\":3.34,\"visibility\":7787,\"pop\":1,\"rain\":{\"1h\":2.45}},{\"dt\":1602622800,\"pressure\":999,\"humidity\":92,\"dew_point\":9.31,\"clouds\":100,\"wind_speed\":9.06,\"wind_deg\":45,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":10.48,\"feels_like\":3.98,\"visibility\":4171,\"pop\":1,\"rain\":{\"1h\":2.53}},{\"dt\":1602626400,\"pressure\":998,\"humidity\":92,\"dew_point\":9.63,\"clouds\":100,\"wind_speed\":9.73,\"wind_deg\":41,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10n\"}],\"temp\":10.76,\"feels_like\":3.86,\"visibility\":3895,\"pop\":1,\"rain\":{\"1h\":4.24}},{\"dt\":1602630000,\"pressure\":997,\"humidity\":92,\"dew_point\":10.08,\"clouds\":100,\"wind_speed\":10.08,\"wind_deg\":45,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10n\"}],\"temp\":11.24,\"feels_like\":4.23,\"visibility\":5673,\"pop\":1,\"rain\":{\"1h\":5.15}},{\"dt\":1602633600,\"pressure\":997,\"humidity\":91,\"dew_point\":10.62,\"clouds\":100,\"wind_speed\":9.43,\"wind_deg\":50,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":11.95,\"feels_like\":5.54,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":2.6}},{\"dt\":1602637200,\"pressure\":996,\"humidity\":91,\"dew_point\":11.19,\"clouds\":100,\"wind_speed\":9.07,\"wind_deg\":54,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":12.55,\"feels_like\":6.56,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":1.46}},{\"dt\":1602640800,\"pressure\":995,\"humidity\":93,\"dew_point\":11.51,\"clouds\":100,\"wind_speed\":5.81,\"wind_deg\":99,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10n\"}],\"temp\":12.45,\"feels_like\":8.81,\"visibility\":9335,\"pop\":1,\"rain\":{\"1h\":3.85}},{\"dt\":1602644400,\"pressure\":995,\"humidity\":88,\"dew_point\":9.03,\"clouds\":100,\"wind_speed\":4.79,\"wind_deg\":139,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10n\"}],\"temp\":10.91,\"feels_like\":7.34,\"visibility\":10000,\"pop\":1,\"rain\":{\"1h\":0.64}},{\"dt\":1602648000,\"pressure\":995,\"humidity\":83,\"dew_point\":8.34,\"clouds\":100,\"wind_speed\":4.93,\"wind_deg\":130,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":11.04,\"feels_like\":7.19,\"visibility\":10000,\"pop\":0.8},{\"dt\":1602651600,\"pressure\":996,\"humidity\":82,\"dew_point\":7.76,\"clouds\":100,\"wind_speed\":5.16,\"wind_deg\":125,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":10.62,\"feels_like\":6.47,\"visibility\":10000,\"pop\":0.8},{\"dt\":1602655200,\"pressure\":997,\"humidity\":79,\"dew_point\":7.14,\"clouds\":95,\"wind_speed\":5.65,\"wind_deg\":124,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":10.45,\"feels_like\":5.79,\"visibility\":10000,\"pop\":0.8},{\"dt\":1602658800,\"pressure\":998,\"humidity\":75,\"dew_point\":6.41,\"clouds\":97,\"wind_speed\":5.65,\"wind_deg\":129,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":10.58,\"feels_like\":5.78,\"visibility\":10000,\"pop\":0},{\"dt\":1602662400,\"pressure\":998,\"humidity\":71,\"dew_point\":6.14,\"clouds\":64,\"wind_speed\":5.8,\"wind_deg\":128,\"weather\":[{\"description\":\"Broken Clouds\",\"icon\":\"04d\"}],\"temp\":11.06,\"feels_like\":6.08,\"visibility\":10000,\"pop\":0},{\"dt\":1602666000,\"pressure\":999,\"humidity\":68,\"dew_point\":6.08,\"clouds\":63,\"wind_speed\":5.75,\"wind_deg\":125,\"weather\":[{\"description\":\"Broken Clouds\",\"icon\":\"04d\"}],\"temp\":11.68,\"feels_like\":6.73,\"visibility\":10000,\"pop\":0},{\"dt\":1602669600,\"pressure\":999,\"humidity\":66,\"dew_point\":5.97,\"clouds\":64,\"wind_speed\":5.89,\"wind_deg\":122,\"weather\":[{\"description\":\"Broken Clouds\",\"icon\":\"04d\"}],\"temp\":12.08,\"feels_like\":7.02,\"visibility\":10000,\"pop\":0},{\"dt\":1602673200,\"pressure\":1000,\"humidity\":69,\"dew_point\":6.15,\"clouds\":71,\"wind_speed\":5.42,\"wind_deg\":120,\"weather\":[{\"description\":\"Broken Clouds\",\"icon\":\"04d\"}],\"temp\":11.58,\"feels_like\":6.89,\"visibility\":10000,\"pop\":0},{\"dt\":1602676800,\"pressure\":1000,\"humidity\":76,\"dew_point\":6.8,\"clouds\":76,\"wind_speed\":4.92,\"wind_deg\":126,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":10.78,\"feels_like\":6.57,\"visibility\":10000,\"pop\":0.2,\"rain\":{\"1h\":0.13}},{\"dt\":1602680400,\"pressure\":1001,\"humidity\":78,\"dew_point\":6.82,\"clouds\":100,\"wind_speed\":4.29,\"wind_deg\":120,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"temp\":10.37,\"feels_like\":6.6,\"visibility\":10000,\"pop\":0.49,\"rain\":{\"1h\":0.11}},{\"dt\":1602684000,\"pressure\":1001,\"humidity\":77,\"dew_point\":6.75,\"clouds\":100,\"wind_speed\":4.18,\"wind_deg\":115,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":10.48,\"feels_like\":6.77,\"visibility\":10000,\"pop\":0.41},{\"dt\":1602687600,\"pressure\":1001,\"humidity\":80,\"dew_point\":7.05,\"clouds\":100,\"wind_speed\":3.75,\"wind_deg\":122,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":10.18,\"feels_like\":6.83,\"visibility\":10000,\"pop\":0.32},{\"dt\":1602691200,\"pressure\":1001,\"humidity\":80,\"dew_point\":6.78,\"clouds\":100,\"wind_speed\":3.41,\"wind_deg\":119,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10n\"}],\"temp\":10.05,\"feels_like\":6.91,\"visibility\":10000,\"pop\":0.28,\"rain\":{\"1h\":0.18}},{\"dt\":1602694800,\"pressure\":1002,\"humidity\":75,\"dew_point\":6.1,\"clouds\":100,\"wind_speed\":3.51,\"wind_deg\":129,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":10.22,\"feels_like\":6.84,\"visibility\":10000,\"pop\":0.12},{\"dt\":1602698400,\"pressure\":1003,\"humidity\":74,\"dew_point\":5.22,\"clouds\":94,\"wind_speed\":3.78,\"wind_deg\":142,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":9.52,\"feels_like\":5.77,\"visibility\":10000,\"pop\":0.08},{\"dt\":1602702000,\"pressure\":1003,\"humidity\":77,\"dew_point\":5.07,\"clouds\":99,\"wind_speed\":4.18,\"wind_deg\":133,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.76,\"feels_like\":4.7,\"visibility\":10000,\"pop\":0.01},{\"dt\":1602705600,\"pressure\":1003,\"humidity\":79,\"dew_point\":5.18,\"clouds\":98,\"wind_speed\":4.24,\"wind_deg\":128,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.44,\"feels_like\":4.35,\"visibility\":10000,\"pop\":0.05},{\"dt\":1602709200,\"pressure\":1003,\"humidity\":78,\"dew_point\":5.29,\"clouds\":100,\"wind_speed\":4.22,\"wind_deg\":129,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.85,\"feels_like\":4.82,\"visibility\":10000,\"pop\":0.09},{\"dt\":1602712800,\"pressure\":1004,\"humidity\":78,\"dew_point\":5.36,\"clouds\":100,\"wind_speed\":4.1,\"wind_deg\":129,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.83,\"feels_like\":4.88,\"visibility\":10000,\"pop\":0.08},{\"dt\":1602716400,\"pressure\":1004,\"humidity\":80,\"dew_point\":5.65,\"clouds\":100,\"wind_speed\":3.97,\"wind_deg\":130,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.84,\"feels_like\":5.05,\"visibility\":10000,\"pop\":0.05},{\"dt\":1602720000,\"pressure\":1004,\"humidity\":80,\"dew_point\":5.81,\"clouds\":100,\"wind_speed\":4.11,\"wind_deg\":135,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.95,\"feels_like\":5.09,\"visibility\":10000,\"pop\":0.05},{\"dt\":1602723600,\"pressure\":1005,\"humidity\":81,\"dew_point\":5.83,\"clouds\":100,\"wind_speed\":3.91,\"wind_deg\":140,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.91,\"feels_like\":5.22,\"visibility\":10000,\"pop\":0.16},{\"dt\":1602727200,\"pressure\":1005,\"humidity\":82,\"dew_point\":6.01,\"clouds\":100,\"wind_speed\":3.38,\"wind_deg\":147,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.88,\"feels_like\":5.59,\"visibility\":10000,\"pop\":0.12},{\"dt\":1602730800,\"pressure\":1005,\"humidity\":80,\"dew_point\":5.94,\"clouds\":100,\"wind_speed\":3.25,\"wind_deg\":153,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":9.06,\"feels_like\":5.82,\"visibility\":10000,\"pop\":0.2},{\"dt\":1602734400,\"pressure\":1006,\"humidity\":81,\"dew_point\":5.93,\"clouds\":98,\"wind_speed\":3.35,\"wind_deg\":141,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.9,\"feels_like\":5.6,\"visibility\":10000,\"pop\":0.29},{\"dt\":1602738000,\"pressure\":1006,\"humidity\":83,\"dew_point\":6.09,\"clouds\":99,\"wind_speed\":3.17,\"wind_deg\":132,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04n\"}],\"temp\":8.76,\"feels_like\":5.63,\"visibility\":10000,\"pop\":0.44},{\"dt\":1602741600,\"pressure\":1006,\"humidity\":85,\"dew_point\":6.4,\"clouds\":99,\"wind_speed\":2.08,\"wind_deg\":112,\"weather\":[{\"description\":\"Overcast Clouds\",\"icon\":\"04d\"}],\"temp\":8.72,\"feels_like\":6.42,\"visibility\":10000,\"pop\":0.52}],\"daily\":[{\"dt\":1602583200,\"pressure\":1011,\"humidity\":93,\"dew_point\":6.12,\"clouds\":87,\"wind_speed\":5.2,\"wind_deg\":23,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10d\"}],\"sunrise\":1602565066,\"sunset\":1602603969,\"temp\":{\"day\":7.17,\"min\":6.66,\"max\":10.48,\"night\":10.48,\"eve\":8.41,\"morn\":7.13},\"feels_like\":{\"morn\":2.8,\"day\":2.64,\"eve\":2.31,\"night\":3.98},\"uvi\":1.69,\"pop\":1,\"rain\":19.08},{\"dt\":1602669600,\"pressure\":999,\"humidity\":68,\"dew_point\":6.08,\"clouds\":63,\"wind_speed\":5.75,\"wind_deg\":125,\"weather\":[{\"description\":\"Heavy Intensity Rain\",\"icon\":\"10d\"}],\"sunrise\":1602651571,\"sunset\":1602690236,\"temp\":{\"day\":11.68,\"min\":8.85,\"max\":11.95,\"night\":8.85,\"eve\":10.18,\"morn\":10.91},\"feels_like\":{\"morn\":7.34,\"day\":6.73,\"eve\":6.83,\"night\":4.82},\"uvi\":1.81,\"pop\":1,\"rain\":18.58},{\"dt\":1602756000,\"pressure\":1009,\"humidity\":79,\"dew_point\":6.38,\"clouds\":100,\"wind_speed\":2.32,\"wind_deg\":282,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"sunrise\":1602738076,\"sunset\":1602776504,\"temp\":{\"day\":9.81,\"min\":8.3,\"max\":11.06,\"night\":8.3,\"eve\":10.97,\"morn\":9.06},\"feels_like\":{\"morn\":5.82,\"day\":7.34,\"eve\":9.15,\"night\":6.74},\"uvi\":1.78,\"pop\":0.69,\"rain\":1.64},{\"dt\":1602842400,\"pressure\":1012,\"humidity\":74,\"dew_point\":5.39,\"clouds\":23,\"wind_speed\":2.79,\"wind_deg\":36,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10d\"}],\"sunrise\":1602824582,\"sunset\":1602862773,\"temp\":{\"day\":9.65,\"min\":6.63,\"max\":11.69,\"night\":8.23,\"eve\":10.89,\"morn\":6.72},\"feels_like\":{\"morn\":4.72,\"day\":6.62,\"eve\":7.72,\"night\":4.06},\"uvi\":1.61,\"pop\":0.93,\"rain\":3.16},{\"dt\":1602928800,\"pressure\":1013,\"humidity\":72,\"dew_point\":2.48,\"clouds\":100,\"wind_speed\":4.44,\"wind_deg\":357,\"weather\":[{\"description\":\"Moderate Rain\",\"icon\":\"10d\"}],\"sunrise\":1602911087,\"sunset\":1602949042,\"temp\":{\"day\":7.02,\"min\":5.03,\"max\":7.8,\"night\":5.03,\"eve\":7.52,\"morn\":6.9},\"feels_like\":{\"morn\":2,\"day\":2.29,\"eve\":3.33,\"night\":1.45},\"uvi\":1.58,\"pop\":0.77,\"rain\":3.3},{\"dt\":1603015200,\"pressure\":1018,\"humidity\":69,\"dew_point\":2.93,\"clouds\":2,\"wind_speed\":4.65,\"wind_deg\":263,\"weather\":[{\"description\":\"Clear Sky\",\"icon\":\"01d\"}],\"sunrise\":1602997594,\"sunset\":1603035313,\"temp\":{\"day\":8.13,\"min\":4.6,\"max\":9.94,\"night\":8.92,\"eve\":9.53,\"morn\":4.72},\"feels_like\":{\"morn\":0.27,\"day\":3.34,\"eve\":4.51,\"night\":4.16},\"uvi\":1.43,\"pop\":0},{\"dt\":1603101600,\"pressure\":1018,\"humidity\":61,\"dew_point\":3.03,\"clouds\":80,\"wind_speed\":4.84,\"wind_deg\":253,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"sunrise\":1603084100,\"sunset\":1603121585,\"temp\":{\"day\":10,\"min\":7.88,\"max\":10.06,\"night\":8.72,\"eve\":9.99,\"morn\":8.69},\"feels_like\":{\"morn\":4.06,\"day\":5.08,\"eve\":5.61,\"night\":5.1},\"uvi\":1.49,\"pop\":0.32,\"rain\":0.61},{\"dt\":1603188000,\"pressure\":1023,\"humidity\":74,\"dew_point\":3.07,\"clouds\":89,\"wind_speed\":2.58,\"wind_deg\":37,\"weather\":[{\"description\":\"Light Rain\",\"icon\":\"10d\"}],\"sunrise\":1603170607,\"sunset\":1603207857,\"temp\":{\"day\":7.2,\"min\":4.57,\"max\":7.98,\"night\":4.57,\"eve\":7.98,\"morn\":7.37},\"feels_like\":{\"morn\":4.79,\"day\":3.87,\"eve\":4.64,\"night\":0.35},\"uvi\":1.55,\"pop\":0.4,\"rain\":0.85}]}]}";

    @BeforeClass
    public static void setUpClass() throws JSONException {
        AppData.fromJSON(new JSONObject(APP_DATA));
    }

    @Test
    public void fromJSON() {
        Settings settings = AppData.getSettings();
        assertNotNull(settings);
        assertNotNull(AppData.getCities());
        assertEquals(2, AppData.getCities().size());
    }

    @Test
    public void toJSON() throws JSONException {
        JSONObject obj = AppData.toJSON();

        assertEquals(APP_DATA, obj.toString());
    }

}