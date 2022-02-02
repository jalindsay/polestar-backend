package com.jalindsay;

public class Entry {

	private String Name;

	private Long AlarmColor;

	private Long Id;

	private Long DatasourcesCount;

	private String _alertIcon;

	private Long ElementCount;

	private String UniqueId;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getAlarmColor() {
		return AlarmColor;
	}

	public void setAlarmColor(Long alarmColor) {
		AlarmColor = alarmColor;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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

	public Long getElementCount() {
		return ElementCount;
	}

	public void setElementCount(Long elementCount) {
		ElementCount = elementCount;
	}

	public String getUniqueId() {
		return UniqueId;
	}

	public void setUniqueId(String uniqueId) {
		UniqueId = uniqueId;
	}
}
