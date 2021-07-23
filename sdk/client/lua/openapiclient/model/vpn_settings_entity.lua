--[[
  Lethean VPM
 
  Distributed Virtual Private Marketplace
 
  The version of the OpenAPI document: 1
  Contact: contact@lethean.io
  Generated by: https://openapi-generator.tech
]]

-- vpn_settings_entity class
local vpn_settings_entity = {}
local vpn_settings_entity_mt = {
	__name = "vpn_settings_entity";
	__index = vpn_settings_entity;
}

local function cast_vpn_settings_entity(t)
	return setmetatable(t, vpn_settings_entity_mt)
end

local function new_vpn_settings_entity(endpoint, port, parameters, terms, policy)
	return cast_vpn_settings_entity({
		["endpoint"] = endpoint;
		["port"] = port;
		["parameters"] = parameters;
		["terms"] = terms;
		["policy"] = policy;
	})
end

return {
	cast = cast_vpn_settings_entity;
	new = new_vpn_settings_entity;
}
