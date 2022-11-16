package com.gpswoxapi.external.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "user_id",
        "icon_colors",
        "active",
        "deleted",
        "name",
        "imei",
        "fuel_measurement_id",
        "fuel_quantity",
        "fuel_price",
        "fuel_per_km",
        "sim_number",
        "msisdn",
        "device_model",
        "plate_number",
        "vin",
        "registration_number",
        "object_owner",
        "additional_notes",
        "expiration_date",
        "sim_expiration_date",
        "sim_activation_date",
        "installation_date",
        "tail_color",
        "tail_length",
        "engine_hours",
        "detect_engine",
        "detect_speed",
        "detect_distance",
        "min_moving_speed",
        "min_fuel_fillings",
        "min_fuel_thefts",
        "snap_to_road",
        "gprs_templates_only",
        "valid_by_avg_speed",
        "parameters",
        "currents",
        "created_at",
        "updated_at",
        "forward",
        "device_type_id",
        "app_tracker_login",
        "stop_duration",
        "sensors",
        "services",
        "driver",
        "traccar",
        "icon",
        "users",
        "pivot",
        "lastValidLatitude",
        "lastValidLongitude",
        "latest_positions",
        "icon_type",
        "group_id",
        "user_timezone_id",
        "time",
        "course",
        "speed"
})
@Generated("jsonschema2pojo")
public class DeviceData {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("current_driver_id")
    private Object currentDriverId;
    @JsonProperty("timezone_id")
    private Object timezoneId;
    @JsonProperty("traccar_device_id")
    private Integer traccarDeviceId;
    @JsonProperty("icon_id")
    private Integer iconId;
    @JsonProperty("icon_colors")
    private IconColors__1 iconColors;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("deleted")
    private Integer deleted;
    @JsonProperty("name")
    private String name;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("fuel_measurement_id")
    private Integer fuelMeasurementId;
    @JsonProperty("fuel_quantity")
    private String fuelQuantity;
    @JsonProperty("fuel_price")
    private String fuelPrice;
    @JsonProperty("fuel_per_km")
    private String fuelPerKm;
    @JsonProperty("sim_number")
    private String simNumber;
    @JsonProperty("msisdn")
    private Object msisdn;
    @JsonProperty("device_model")
    private String deviceModel;
    @JsonProperty("plate_number")
    private String plateNumber;
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("registration_number")
    private String registrationNumber;
    @JsonProperty("object_owner")
    private String objectOwner;
    @JsonProperty("additional_notes")
    private String additionalNotes;
    @JsonProperty("expiration_date")
    private Object expirationDate;
    @JsonProperty("sim_expiration_date")
    private String simExpirationDate;
    @JsonProperty("sim_activation_date")
    private String simActivationDate;
    @JsonProperty("installation_date")
    private String installationDate;
    @JsonProperty("tail_color")
    private String tailColor;
    @JsonProperty("tail_length")
    private Integer tailLength;
    @JsonProperty("engine_hours")
    private String engineHours;
    @JsonProperty("detect_engine")
    private String detectEngine;
    @JsonProperty("detect_speed")
    private String detectSpeed;
    @JsonProperty("detect_distance")
    private Object detectDistance;
    @JsonProperty("min_moving_speed")
    private Integer minMovingSpeed;
    @JsonProperty("min_fuel_fillings")
    private Integer minFuelFillings;
    @JsonProperty("min_fuel_thefts")
    private Integer minFuelThefts;
    @JsonProperty("snap_to_road")
    private Integer snapToRoad;
    @JsonProperty("gprs_templates_only")
    private Integer gprsTemplatesOnly;
    @JsonProperty("valid_by_avg_speed")
    private Integer validByAvgSpeed;
    @JsonProperty("parameters")
    private String parameters;
    @JsonProperty("currents")
    private Object currents;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("forward")
    private Object forward;
    @JsonProperty("device_type_id")
    private Object deviceTypeId;
    @JsonProperty("app_tracker_login")
    private Integer appTrackerLogin;
    @JsonProperty("stop_duration")
    private String stopDuration;
    @JsonProperty("sensors")
    private List<Sensor__1> sensors = null;
    @JsonProperty("services")
    private List<Object> services = null;
    @JsonProperty("driver")
    private Object driver;
    @JsonProperty("traccar")
    private Traccar traccar;
    @JsonProperty("icon")
    private Icon__1 icon;
    @JsonProperty("users")
    private Users users;
    @JsonProperty("pivot")
    private Pivot pivot;
    @JsonProperty("lastValidLatitude")
    private Double lastValidLatitude;
    @JsonProperty("lastValidLongitude")
    private Double lastValidLongitude;
    @JsonProperty("latest_positions")
    private String latestPositions;
    @JsonProperty("icon_type")
    private String iconType;
    @JsonProperty("group_id")
    private Integer groupId;
    @JsonProperty("user_timezone_id")
    private Object userTimezoneId;
    @JsonProperty("time")
    private String time;
    @JsonProperty("course")
    private Integer course;
    @JsonProperty("speed")
    private Integer speed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("current_driver_id")
    public Object getCurrentDriverId() {
        return currentDriverId;
    }

    @JsonProperty("current_driver_id")
    public void setCurrentDriverId(Object currentDriverId) {
        this.currentDriverId = currentDriverId;
    }

    @JsonProperty("timezone_id")
    public Object getTimezoneId() {
        return timezoneId;
    }

    @JsonProperty("timezone_id")
    public void setTimezoneId(Object timezoneId) {
        this.timezoneId = timezoneId;
    }

    @JsonProperty("traccar_device_id")
    public Integer getTraccarDeviceId() {
        return traccarDeviceId;
    }

    @JsonProperty("traccar_device_id")
    public void setTraccarDeviceId(Integer traccarDeviceId) {
        this.traccarDeviceId = traccarDeviceId;
    }

    @JsonProperty("icon_id")
    public Integer getIconId() {
        return iconId;
    }

    @JsonProperty("icon_id")
    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    @JsonProperty("icon_colors")
    public IconColors__1 getIconColors() {
        return iconColors;
    }

    @JsonProperty("icon_colors")
    public void setIconColors(IconColors__1 iconColors) {
        this.iconColors = iconColors;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("deleted")
    public Integer getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("imei")
    public String getImei() {
        return imei;
    }

    @JsonProperty("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    @JsonProperty("fuel_measurement_id")
    public Integer getFuelMeasurementId() {
        return fuelMeasurementId;
    }

    @JsonProperty("fuel_measurement_id")
    public void setFuelMeasurementId(Integer fuelMeasurementId) {
        this.fuelMeasurementId = fuelMeasurementId;
    }

    @JsonProperty("fuel_quantity")
    public String getFuelQuantity() {
        return fuelQuantity;
    }

    @JsonProperty("fuel_quantity")
    public void setFuelQuantity(String fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @JsonProperty("fuel_price")
    public String getFuelPrice() {
        return fuelPrice;
    }

    @JsonProperty("fuel_price")
    public void setFuelPrice(String fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    @JsonProperty("fuel_per_km")
    public String getFuelPerKm() {
        return fuelPerKm;
    }

    @JsonProperty("fuel_per_km")
    public void setFuelPerKm(String fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    @JsonProperty("sim_number")
    public String getSimNumber() {
        return simNumber;
    }

    @JsonProperty("sim_number")
    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    @JsonProperty("msisdn")
    public Object getMsisdn() {
        return msisdn;
    }

    @JsonProperty("msisdn")
    public void setMsisdn(Object msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("device_model")
    public String getDeviceModel() {
        return deviceModel;
    }

    @JsonProperty("device_model")
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    @JsonProperty("plate_number")
    public String getPlateNumber() {
        return plateNumber;
    }

    @JsonProperty("plate_number")
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @JsonProperty("registration_number")
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @JsonProperty("object_owner")
    public String getObjectOwner() {
        return objectOwner;
    }

    @JsonProperty("object_owner")
    public void setObjectOwner(String objectOwner) {
        this.objectOwner = objectOwner;
    }

    @JsonProperty("additional_notes")
    public String getAdditionalNotes() {
        return additionalNotes;
    }

    @JsonProperty("additional_notes")
    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    @JsonProperty("expiration_date")
    public Object getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expiration_date")
    public void setExpirationDate(Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("sim_expiration_date")
    public String getSimExpirationDate() {
        return simExpirationDate;
    }

    @JsonProperty("sim_expiration_date")
    public void setSimExpirationDate(String simExpirationDate) {
        this.simExpirationDate = simExpirationDate;
    }

    @JsonProperty("sim_activation_date")
    public String getSimActivationDate() {
        return simActivationDate;
    }

    @JsonProperty("sim_activation_date")
    public void setSimActivationDate(String simActivationDate) {
        this.simActivationDate = simActivationDate;
    }

    @JsonProperty("installation_date")
    public String getInstallationDate() {
        return installationDate;
    }

    @JsonProperty("installation_date")
    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    @JsonProperty("tail_color")
    public String getTailColor() {
        return tailColor;
    }

    @JsonProperty("tail_color")
    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }

    @JsonProperty("tail_length")
    public Integer getTailLength() {
        return tailLength;
    }

    @JsonProperty("tail_length")
    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }

    @JsonProperty("engine_hours")
    public String getEngineHours() {
        return engineHours;
    }

    @JsonProperty("engine_hours")
    public void setEngineHours(String engineHours) {
        this.engineHours = engineHours;
    }

    @JsonProperty("detect_engine")
    public String getDetectEngine() {
        return detectEngine;
    }

    @JsonProperty("detect_engine")
    public void setDetectEngine(String detectEngine) {
        this.detectEngine = detectEngine;
    }

    @JsonProperty("detect_speed")
    public String getDetectSpeed() {
        return detectSpeed;
    }

    @JsonProperty("detect_speed")
    public void setDetectSpeed(String detectSpeed) {
        this.detectSpeed = detectSpeed;
    }

    @JsonProperty("detect_distance")
    public Object getDetectDistance() {
        return detectDistance;
    }

    @JsonProperty("detect_distance")
    public void setDetectDistance(Object detectDistance) {
        this.detectDistance = detectDistance;
    }

    @JsonProperty("min_moving_speed")
    public Integer getMinMovingSpeed() {
        return minMovingSpeed;
    }

    @JsonProperty("min_moving_speed")
    public void setMinMovingSpeed(Integer minMovingSpeed) {
        this.minMovingSpeed = minMovingSpeed;
    }

    @JsonProperty("min_fuel_fillings")
    public Integer getMinFuelFillings() {
        return minFuelFillings;
    }

    @JsonProperty("min_fuel_fillings")
    public void setMinFuelFillings(Integer minFuelFillings) {
        this.minFuelFillings = minFuelFillings;
    }

    @JsonProperty("min_fuel_thefts")
    public Integer getMinFuelThefts() {
        return minFuelThefts;
    }

    @JsonProperty("min_fuel_thefts")
    public void setMinFuelThefts(Integer minFuelThefts) {
        this.minFuelThefts = minFuelThefts;
    }

    @JsonProperty("snap_to_road")
    public Integer getSnapToRoad() {
        return snapToRoad;
    }

    @JsonProperty("snap_to_road")
    public void setSnapToRoad(Integer snapToRoad) {
        this.snapToRoad = snapToRoad;
    }

    @JsonProperty("gprs_templates_only")
    public Integer getGprsTemplatesOnly() {
        return gprsTemplatesOnly;
    }

    @JsonProperty("gprs_templates_only")
    public void setGprsTemplatesOnly(Integer gprsTemplatesOnly) {
        this.gprsTemplatesOnly = gprsTemplatesOnly;
    }

    @JsonProperty("valid_by_avg_speed")
    public Integer getValidByAvgSpeed() {
        return validByAvgSpeed;
    }

    @JsonProperty("valid_by_avg_speed")
    public void setValidByAvgSpeed(Integer validByAvgSpeed) {
        this.validByAvgSpeed = validByAvgSpeed;
    }

    @JsonProperty("parameters")
    public String getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("currents")
    public Object getCurrents() {
        return currents;
    }

    @JsonProperty("currents")
    public void setCurrents(Object currents) {
        this.currents = currents;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("forward")
    public Object getForward() {
        return forward;
    }

    @JsonProperty("forward")
    public void setForward(Object forward) {
        this.forward = forward;
    }

    @JsonProperty("device_type_id")
    public Object getDeviceTypeId() {
        return deviceTypeId;
    }

    @JsonProperty("device_type_id")
    public void setDeviceTypeId(Object deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    @JsonProperty("app_tracker_login")
    public Integer getAppTrackerLogin() {
        return appTrackerLogin;
    }

    @JsonProperty("app_tracker_login")
    public void setAppTrackerLogin(Integer appTrackerLogin) {
        this.appTrackerLogin = appTrackerLogin;
    }

    @JsonProperty("stop_duration")
    public String getStopDuration() {
        return stopDuration;
    }

    @JsonProperty("stop_duration")
    public void setStopDuration(String stopDuration) {
        this.stopDuration = stopDuration;
    }

    @JsonProperty("sensors")
    public List<Sensor__1> getSensors() {
        return sensors;
    }

    @JsonProperty("sensors")
    public void setSensors(List<Sensor__1> sensors) {
        this.sensors = sensors;
    }

    @JsonProperty("services")
    public List<Object> getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(List<Object> services) {
        this.services = services;
    }

    @JsonProperty("driver")
    public Object getDriver() {
        return driver;
    }

    @JsonProperty("driver")
    public void setDriver(Object driver) {
        this.driver = driver;
    }

    @JsonProperty("traccar")
    public Traccar getTraccar() {
        return traccar;
    }

    @JsonProperty("traccar")
    public void setTraccar(Traccar traccar) {
        this.traccar = traccar;
    }

    @JsonProperty("icon")
    public Icon__1 getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(Icon__1 icon) {
        this.icon = icon;
    }

    @JsonProperty("users")
    public Users getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(Users users) {
        this.users = users;
    }

    @JsonProperty("pivot")
    public Pivot getPivot() {
        return pivot;
    }

    @JsonProperty("pivot")
    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }

    @JsonProperty("lastValidLatitude")
    public Double getLastValidLatitude() {
        return lastValidLatitude;
    }

    @JsonProperty("lastValidLatitude")
    public void setLastValidLatitude(Double lastValidLatitude) {
        this.lastValidLatitude = lastValidLatitude;
    }

    @JsonProperty("lastValidLongitude")
    public Double getLastValidLongitude() {
        return lastValidLongitude;
    }

    @JsonProperty("lastValidLongitude")
    public void setLastValidLongitude(Double lastValidLongitude) {
        this.lastValidLongitude = lastValidLongitude;
    }

    @JsonProperty("latest_positions")
    public String getLatestPositions() {
        return latestPositions;
    }

    @JsonProperty("latest_positions")
    public void setLatestPositions(String latestPositions) {
        this.latestPositions = latestPositions;
    }

    @JsonProperty("icon_type")
    public String getIconType() {
        return iconType;
    }

    @JsonProperty("icon_type")
    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    @JsonProperty("group_id")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("user_timezone_id")
    public Object getUserTimezoneId() {
        return userTimezoneId;
    }

    @JsonProperty("user_timezone_id")
    public void setUserTimezoneId(Object userTimezoneId) {
        this.userTimezoneId = userTimezoneId;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("course")
    public Integer getCourse() {
        return course;
    }

    @JsonProperty("course")
    public void setCourse(Integer course) {
        this.course = course;
    }

    @JsonProperty("speed")
    public Integer getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeviceData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("currentDriverId");
        sb.append('=');
        sb.append(((this.currentDriverId == null)?"<null>":this.currentDriverId));
        sb.append(',');
        sb.append("timezoneId");
        sb.append('=');
        sb.append(((this.timezoneId == null)?"<null>":this.timezoneId));
        sb.append(',');
        sb.append("traccarDeviceId");
        sb.append('=');
        sb.append(((this.traccarDeviceId == null)?"<null>":this.traccarDeviceId));
        sb.append(',');
        sb.append("iconId");
        sb.append('=');
        sb.append(((this.iconId == null)?"<null>":this.iconId));
        sb.append(',');
        sb.append("iconColors");
        sb.append('=');
        sb.append(((this.iconColors == null)?"<null>":this.iconColors));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("imei");
        sb.append('=');
        sb.append(((this.imei == null)?"<null>":this.imei));
        sb.append(',');
        sb.append("fuelMeasurementId");
        sb.append('=');
        sb.append(((this.fuelMeasurementId == null)?"<null>":this.fuelMeasurementId));
        sb.append(',');
        sb.append("fuelQuantity");
        sb.append('=');
        sb.append(((this.fuelQuantity == null)?"<null>":this.fuelQuantity));
        sb.append(',');
        sb.append("fuelPrice");
        sb.append('=');
        sb.append(((this.fuelPrice == null)?"<null>":this.fuelPrice));
        sb.append(',');
        sb.append("fuelPerKm");
        sb.append('=');
        sb.append(((this.fuelPerKm == null)?"<null>":this.fuelPerKm));
        sb.append(',');
        sb.append("simNumber");
        sb.append('=');
        sb.append(((this.simNumber == null)?"<null>":this.simNumber));
        sb.append(',');
        sb.append("msisdn");
        sb.append('=');
        sb.append(((this.msisdn == null)?"<null>":this.msisdn));
        sb.append(',');
        sb.append("deviceModel");
        sb.append('=');
        sb.append(((this.deviceModel == null)?"<null>":this.deviceModel));
        sb.append(',');
        sb.append("plateNumber");
        sb.append('=');
        sb.append(((this.plateNumber == null)?"<null>":this.plateNumber));
        sb.append(',');
        sb.append("vin");
        sb.append('=');
        sb.append(((this.vin == null)?"<null>":this.vin));
        sb.append(',');
        sb.append("registrationNumber");
        sb.append('=');
        sb.append(((this.registrationNumber == null)?"<null>":this.registrationNumber));
        sb.append(',');
        sb.append("objectOwner");
        sb.append('=');
        sb.append(((this.objectOwner == null)?"<null>":this.objectOwner));
        sb.append(',');
        sb.append("additionalNotes");
        sb.append('=');
        sb.append(((this.additionalNotes == null)?"<null>":this.additionalNotes));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("simExpirationDate");
        sb.append('=');
        sb.append(((this.simExpirationDate == null)?"<null>":this.simExpirationDate));
        sb.append(',');
        sb.append("simActivationDate");
        sb.append('=');
        sb.append(((this.simActivationDate == null)?"<null>":this.simActivationDate));
        sb.append(',');
        sb.append("installationDate");
        sb.append('=');
        sb.append(((this.installationDate == null)?"<null>":this.installationDate));
        sb.append(',');
        sb.append("tailColor");
        sb.append('=');
        sb.append(((this.tailColor == null)?"<null>":this.tailColor));
        sb.append(',');
        sb.append("tailLength");
        sb.append('=');
        sb.append(((this.tailLength == null)?"<null>":this.tailLength));
        sb.append(',');
        sb.append("engineHours");
        sb.append('=');
        sb.append(((this.engineHours == null)?"<null>":this.engineHours));
        sb.append(',');
        sb.append("detectEngine");
        sb.append('=');
        sb.append(((this.detectEngine == null)?"<null>":this.detectEngine));
        sb.append(',');
        sb.append("detectSpeed");
        sb.append('=');
        sb.append(((this.detectSpeed == null)?"<null>":this.detectSpeed));
        sb.append(',');
        sb.append("detectDistance");
        sb.append('=');
        sb.append(((this.detectDistance == null)?"<null>":this.detectDistance));
        sb.append(',');
        sb.append("minMovingSpeed");
        sb.append('=');
        sb.append(((this.minMovingSpeed == null)?"<null>":this.minMovingSpeed));
        sb.append(',');
        sb.append("minFuelFillings");
        sb.append('=');
        sb.append(((this.minFuelFillings == null)?"<null>":this.minFuelFillings));
        sb.append(',');
        sb.append("minFuelThefts");
        sb.append('=');
        sb.append(((this.minFuelThefts == null)?"<null>":this.minFuelThefts));
        sb.append(',');
        sb.append("snapToRoad");
        sb.append('=');
        sb.append(((this.snapToRoad == null)?"<null>":this.snapToRoad));
        sb.append(',');
        sb.append("gprsTemplatesOnly");
        sb.append('=');
        sb.append(((this.gprsTemplatesOnly == null)?"<null>":this.gprsTemplatesOnly));
        sb.append(',');
        sb.append("validByAvgSpeed");
        sb.append('=');
        sb.append(((this.validByAvgSpeed == null)?"<null>":this.validByAvgSpeed));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("currents");
        sb.append('=');
        sb.append(((this.currents == null)?"<null>":this.currents));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("forward");
        sb.append('=');
        sb.append(((this.forward == null)?"<null>":this.forward));
        sb.append(',');
        sb.append("deviceTypeId");
        sb.append('=');
        sb.append(((this.deviceTypeId == null)?"<null>":this.deviceTypeId));
        sb.append(',');
        sb.append("appTrackerLogin");
        sb.append('=');
        sb.append(((this.appTrackerLogin == null)?"<null>":this.appTrackerLogin));
        sb.append(',');
        sb.append("stopDuration");
        sb.append('=');
        sb.append(((this.stopDuration == null)?"<null>":this.stopDuration));
        sb.append(',');
        sb.append("sensors");
        sb.append('=');
        sb.append(((this.sensors == null)?"<null>":this.sensors));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null)?"<null>":this.driver));
        sb.append(',');
        sb.append("traccar");
        sb.append('=');
        sb.append(((this.traccar == null)?"<null>":this.traccar));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("pivot");
        sb.append('=');
        sb.append(((this.pivot == null)?"<null>":this.pivot));
        sb.append(',');
        sb.append("lastValidLatitude");
        sb.append('=');
        sb.append(((this.lastValidLatitude == null)?"<null>":this.lastValidLatitude));
        sb.append(',');
        sb.append("lastValidLongitude");
        sb.append('=');
        sb.append(((this.lastValidLongitude == null)?"<null>":this.lastValidLongitude));
        sb.append(',');
        sb.append("latestPositions");
        sb.append('=');
        sb.append(((this.latestPositions == null)?"<null>":this.latestPositions));
        sb.append(',');
        sb.append("iconType");
        sb.append('=');
        sb.append(((this.iconType == null)?"<null>":this.iconType));
        sb.append(',');
        sb.append("groupId");
        sb.append('=');
        sb.append(((this.groupId == null)?"<null>":this.groupId));
        sb.append(',');
        sb.append("userTimezoneId");
        sb.append('=');
        sb.append(((this.userTimezoneId == null)?"<null>":this.userTimezoneId));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        sb.append("speed");
        sb.append('=');
        sb.append(((this.speed == null)?"<null>":this.speed));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}