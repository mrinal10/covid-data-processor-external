/*
 * This file is generated by jOOQ.
 */
package co.homelane.db.jooq.tables;


import co.homelane.db.jooq.DefaultSchema;
import co.homelane.db.jooq.tables.records.CovidVaccineStatewiseRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CovidVaccineStatewise extends TableImpl<CovidVaccineStatewiseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>covid_vaccine_statewise</code>
     */
    public static final CovidVaccineStatewise COVID_VACCINE_STATEWISE = new CovidVaccineStatewise();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CovidVaccineStatewiseRecord> getRecordType() {
        return CovidVaccineStatewiseRecord.class;
    }

    /**
     * The column <code>covid_vaccine_statewise.updated_on</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.LOCALDATETIME(3).nullable(false), this, "");

    /**
     * The column <code>covid_vaccine_statewise.state</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_doses_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_DOSES_ADMINISTERED = createField(DSL.name("total_doses_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_sessions_conducted</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_SESSIONS_CONDUCTED = createField(DSL.name("total_sessions_conducted"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_sites</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_SITES = createField(DSL.name("total_sites"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.first_dose_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> FIRST_DOSE_ADMINISTERED = createField(DSL.name("first_dose_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.second_dose_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> SECOND_DOSE_ADMINISTERED = createField(DSL.name("second_dose_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.male_individuals_vaccinated</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> MALE_INDIVIDUALS_VACCINATED = createField(DSL.name("male_individuals_vaccinated"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.female_individuals_vaccinated</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> FEMALE_INDIVIDUALS_VACCINATED = createField(DSL.name("female_individuals_vaccinated"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.transgender_individuals_vaccinated</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TRANSGENDER_INDIVIDUALS_VACCINATED = createField(DSL.name("transgender_individuals_vaccinated"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_covaxin_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_COVAXIN_ADMINISTERED = createField(DSL.name("total_covaxin_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_covishield_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_COVISHIELD_ADMINISTERED = createField(DSL.name("total_covishield_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_sputnik_v_administered</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_SPUTNIK_V_ADMINISTERED = createField(DSL.name("total_sputnik_v_administered"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.aefi</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> AEFI = createField(DSL.name("aefi"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.age_18_45_years</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> AGE_18_45_YEARS = createField(DSL.name("age_18_45_years"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.age_45_60_years</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> AGE_45_60_YEARS = createField(DSL.name("age_45_60_years"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.age_60_above_years</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> AGE_60_ABOVE_YEARS = createField(DSL.name("age_60_above_years"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>covid_vaccine_statewise.total_individuals_vaccinated</code>.
     */
    public final TableField<CovidVaccineStatewiseRecord, String> TOTAL_INDIVIDUALS_VACCINATED = createField(DSL.name("total_individuals_vaccinated"), SQLDataType.VARCHAR(100), this, "");

    private CovidVaccineStatewise(Name alias, Table<CovidVaccineStatewiseRecord> aliased) {
        this(alias, aliased, null);
    }

    private CovidVaccineStatewise(Name alias, Table<CovidVaccineStatewiseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>covid_vaccine_statewise</code> table reference
     */
    public CovidVaccineStatewise(String alias) {
        this(DSL.name(alias), COVID_VACCINE_STATEWISE);
    }

    /**
     * Create an aliased <code>covid_vaccine_statewise</code> table reference
     */
    public CovidVaccineStatewise(Name alias) {
        this(alias, COVID_VACCINE_STATEWISE);
    }

    /**
     * Create a <code>covid_vaccine_statewise</code> table reference
     */
    public CovidVaccineStatewise() {
        this(DSL.name("covid_vaccine_statewise"), null);
    }

    public <O extends Record> CovidVaccineStatewise(Table<O> child, ForeignKey<O, CovidVaccineStatewiseRecord> key) {
        super(child, key, COVID_VACCINE_STATEWISE);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public CovidVaccineStatewise as(String alias) {
        return new CovidVaccineStatewise(DSL.name(alias), this);
    }

    @Override
    public CovidVaccineStatewise as(Name alias) {
        return new CovidVaccineStatewise(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CovidVaccineStatewise rename(String name) {
        return new CovidVaccineStatewise(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CovidVaccineStatewise rename(Name name) {
        return new CovidVaccineStatewise(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<LocalDateTime, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
