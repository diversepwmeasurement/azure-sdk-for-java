namespace Fixtures.Azure.SwaggerBatPaging.Models
{
    using System;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Microsoft.Azure;

    /// <summary>
    /// </summary>
    public partial class OperationResult
    {
        /// <summary>
        /// The status of the request. Possible values for this property
        /// include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
        /// 'Creating', 'Created', 'Updating', 'Updated', 'Deleting',
        /// 'Deleted', 'OK'
        /// </summary>
        [JsonProperty(PropertyName = "status")]
        public string Status { get; set; }

    }
}
