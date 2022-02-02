package com.jalindsay;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {

	private String Name;

	private Long AlarmColor;

	private Long Id;

	private Long DatasourcesCount;

	private String _alertIcon;

	private Long ElementCount;

	private String UniqueId;

	private Object parameters;

	@JsonProperty("Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@JsonProperty("AlarmColor")
	public Long getAlarmColor() {
		return AlarmColor;
	}

	public void setAlarmColor(Long alarmColor) {
		AlarmColor = alarmColor;
	}

	@JsonProperty("Id")
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@JsonProperty("DatasourcesCount")
	public Long getDatasourcesCount() {
		return DatasourcesCount;
	}

	public void setDatasourcesCount(Long datasourcesCount) {
		DatasourcesCount = datasourcesCount;
	}

	public String get_alertIcon() {
		return _alertIcon;
	}

	public void set_alertIcon(String _alertIcon) {
		this._alertIcon = _alertIcon;
	}

	@JsonProperty("ElementCount")
	public Long getElementCount() {
		return ElementCount;
	}

	public void setElementCount(Long elementCount) {
		ElementCount = elementCount;
	}

	@JsonProperty("UniqueID")
	public String getUniqueId() {
		return UniqueId;
	}

	public void setUniqueId(String uniqueId) {
		UniqueId = uniqueId;
	}

	@JsonProperty("Parameters")
	public Object getParameters() {
		return parameters;
	}

	public void setParameters(Object parameters) {
		this.parameters = parameters;
	}
}
