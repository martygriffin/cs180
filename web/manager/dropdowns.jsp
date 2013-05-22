Viewing by Date: 
<s:select list="start_end" name="start_end" value="selectedStartEnd"/>
<s:select list="on_before_after" name="on_before_after" value="selectedOnBeforeAfter"/>
<s:textfield name="startDate" id="datepicker" value="%{getText('format.date',{selectedDate})}"/>