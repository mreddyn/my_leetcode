-- +----------------+---------+
-- | Column Name    | Type    |
-- +----------------+---------+
-- | machine_id     | int     |
-- | process_id     | int     |
-- | activity_type  | enum    |
-- | timestamp      | float   |
-- +----------------+---------+
-- The table shows the user activities for a factory website.
-- (machine_id, process_id, activity_type) is the primary key (combination of columns with unique values) of this table.
-- machine_id is the ID of a machine.
-- process_id is the ID of a process running on the machine with ID machine_id.
-- activity_type is an ENUM (category) of type ('start', 'end').
-- timestamp is a float representing the current time in seconds.
-- 'start' means the machine starts the process at the given timestamp and 'end' means the machine ends the process at the given timestamp.
-- The 'start' timestamp will always be before the 'end' timestamp for every (machine_id, process_id) pair.
 

-- There is a factory website that has several machines each running the same number of processes. Write a solution to find the average time each machine takes to complete a process.

-- The time to complete a process is the 'end' timestamp minus the 'start' timestamp. The average time is calculated by the total time to complete every process on the machine divided by the number of processes that were run.

-- The resulting table should have the machine_id along with the average time as processing_time, which should be rounded to 3 decimal places.

-- Return the result table in any order.

-- The result format is in the following example.

SELECT activityTableOne.machine_id, ROUND(AVG(activityTableTwo.timestamp - activityTableOne.timestamp), 3) AS processing_time
FROM Activity AS activityTableOne
JOIN Activity AS activityTableTwo
ON activityTableOne.machine_id = activityTableTwo.machine_id
AND activityTableOne.process_id = activityTableTwo.process_id
AND activityTableOne.activity_type = 'start'
AND activityTableTwo.activity_type = 'end'
GROUP BY activityTableOne.machine_id
